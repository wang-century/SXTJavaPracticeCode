package part3.game.plane;

import java.awt.*;
import java.awt.event.KeyEvent;

/***
 * @title 飞机
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 13:29
 **/
public class Plane extends GameObject {
    int speed;
    boolean left, up, right, down;
    boolean live = true;   // 是否存活

    public Plane(Image image, int x, int y) {
        super();
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = 4;
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    /**
     * 画自己
     *
     * @param g 画笔
     */
    @Override
    public void drawSelf(Graphics g) {
        if (live) {
            super.drawSelf(g);
            if (left) {
                x -= speed;
            }
            if (right) {
                x += speed;
            }
            if (up) {
                y -= speed;
            }
            if (down) {
                y += speed;
            }
        }
    }

    /**
     * 按下某个键，增加相应方向
     *
     * @param e 按键事件
     */
    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }

    /**
     * 松开某个键，取消相应方向
     *
     * @param e 按键事件
     */
    public void minusDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
        }
    }
}
