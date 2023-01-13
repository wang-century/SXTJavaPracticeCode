package part3.game.plane;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.util.Date;

/***
 * @title 飞机游戏主窗口
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 12:40
 **/
public class GameFrame extends Frame {
    Image planeImg = GameUtil.getImage("images/part3/plane.png");  // 飞机
    Image bgImg = GameUtil.getImage("images/part3/bg.jpg");    // 背景
    Plane plane = new Plane(planeImg, 250, 250);// 飞机
    Shell[] shells = new Shell[50]; // 炮弹数组
    Explode explode;
    Date startTime = new Date();    // 开始时间
    Date endTime;    // 结束时间
    int period; // 游戏持续时间

    /**
     * 初始化窗口
     */
    public void launchFrame() {
        this.setTitle("飞机游戏主窗口");   // 设置标题
        this.setVisible(true);  // 显示窗口
        this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT); // 设置窗口高度宽度
        this.setLocation(300, 300);  // 设置在桌面显示的位置
        this.addWindowListener(new WindowAdapter() {
            /**
             * 设置点击叉号关闭应用
             * @param e the event to be processed
             */
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();  // 启动初始化窗口的线程
        addKeyListener(new KeyMonitor());   // 增加键盘的监听
        // 生成炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i] = new Shell();
        }
    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            // 反复的初始化窗口
            while (true) {
                repaint();  // 重画窗口
                try {
                    Thread.sleep(40);   // 40ms刷新一次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 键盘监听类
     */
    class KeyMonitor extends KeyAdapter {
        /**
         * @param e 按下键的事件
         */
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }

        /**
         * @param e 松开键的事件
         */
        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
    }


    /**
     * 画笔
     *
     * @param graphics the specified Graphics window 相当于画笔
     */
    @Override
    public void paint(Graphics graphics) {
        /* Color color = graphics.getColor();  // 获取画笔颜色并保存，用于设置画笔颜色后恢复原有颜色
        graphics.setFont(new Font("宋体", Font.BOLD, 30));    // 设置字体样式
        graphics.setColor(Color.PINK);  // 设置画笔颜色
        graphics.drawLine(100, 100, 300, 300); // 画一条线
        graphics.drawRect(100, 100, 300, 300); // 画矩形
        graphics.drawOval(100, 100, 300, 300); // 画圆
        graphics.fillRect(100, 100, 50, 50); // 画颜色填充的矩形
        graphics.drawString("Hello, world!", 50, 70); // 写文字
        graphics.setColor(color);   // 恢复画笔颜色 */
        graphics.drawImage(bgImg, 0, 0, null);   // 画图片
        plane.drawSelf(graphics);   // 画飞机
        // 画炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i].draw(graphics);
            boolean over = shells[i].getRect().intersects(plane.getRect());    // 检测是否碰撞
            if (over) {
                plane.live = false; // 修改飞机状态
                endTime = new Date();
                if (period == 0){
                    period = (int) (endTime.getTime() - startTime.getTime()) / 1000;
                }
                // 增加判断，防止重复创建
                if (explode == null) {
                    explode = new Explode(plane.x, plane.y);
                }
                explode.draw(graphics);
            }
        }
        if (!plane.live) {
            Color color = graphics.getColor();
            graphics.setColor(Color.RED);
            graphics.drawString("游戏结束！存活时间："+period+"秒", plane.x, plane.y);
            graphics.setColor(color);
        }
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.launchFrame();
    }

    private Image offScreenImage = null;

    /**
     * 用于解决闪烁的问题
     *
     * @param g the specified Graphics window
     */
    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }
}
