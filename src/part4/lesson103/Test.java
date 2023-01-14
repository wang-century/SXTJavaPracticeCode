package part4.lesson103;

/***
 * @title 接口、多继承、面向接口编程
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 16:25
 **/
public class Test {
    public static void main(String[] args) {
        Angel angel = new Angel();
        angel.fly();
        angel.helpOthers();
    }
}

/**
 * 飞行接口
 */
interface Volant{
    int FLY_HEIGHT = 100;   // 默认public static final
    void fly(); // 默认public abstract void fly();
}

/**
 * 善良接口
 */
interface Honest{
    void helpOthers();
}

class Angel implements Volant, Honest{

    @Override
    public void fly() {
        System.out.println("天使会飞");
    }

    /**
     *
     */
    @Override
    public void helpOthers() {
        System.out.println("天使会帮助他人");
    }
}
