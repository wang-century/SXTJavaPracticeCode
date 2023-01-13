package part3.game.plane;

import java.awt.*;

/***
 * @title 炮弹
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 13:47
 **/
public class Shell extends GameObject {
    double degree;

    public Shell() {
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed = 3;
        degree = Math.random() * Math.PI * 2; // 弧度0-2PI
    }

    public void draw(Graphics g) {
        Color color = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);
        // 炮弹按指定角度飞
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);
        if (x < 0 || x > Constant.GAME_WIDTH - width) {
            degree = Math.PI - degree;
        }
        if (y < 30 || y > Constant.GAME_HEIGHT - height) {
            degree = -degree;
        }
        g.setColor(color);
    }
}
