package part3.game.plane;

import java.awt.*;

/***
 * @title 游戏物体的父类
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 13:25
 **/
public class GameObject {
    Image image;
    int x;
    int y;
    int width;
    int height;
    int speed;

    public void drawSelf(Graphics g) {
        g.drawImage(image, (int)x, (int)y, null);
    }

    public GameObject(Image image, int x, int y, int width, int height, int speed) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public GameObject(Image image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }

    public GameObject() {
    }

    /**
     * 返回物体所在的矩形，便于后续碰撞检测
     * @return 物体所在的矩形
     */
    public Rectangle getRect(){
        return new Rectangle(x, y, width, height);
    }
}
