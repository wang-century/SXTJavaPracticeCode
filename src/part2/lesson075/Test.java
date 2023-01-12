package part2.lesson075;

/***
 * @title 方法的重写
 * @description 重写父类方法
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 13:40
 **/
public class Test {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("跑");
    }
    public void stop(){
        System.out.println("停");
    }
}

class Horse extends Vehicle{
    /**
     * 重写父类run
     */
    public void run(){
        System.out.println("四蹄跑");
    }
}
