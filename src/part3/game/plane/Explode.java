package part3.game.plane;

import java.awt.*;

/***
 * @title 爆炸类
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 14:08
 **/
public class Explode {
    double x, y;

    static Image[] imgs = new Image[16];
    // 加载图片
    static {
        for (int i = 0; i < 16; i++) {
            imgs[i] = GameUtil.getImage("images/part3/explode/e" + (i + 1) + ".gif");
            imgs[i].getWidth(null);
        }
    }

    int count;

    public void draw(Graphics g) {
        if (count <= 15) {
            g.drawImage(imgs[count], (int) x, (int) y, null);
            count++;
        }
    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}