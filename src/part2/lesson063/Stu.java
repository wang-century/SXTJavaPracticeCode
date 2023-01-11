package part2.lesson063;

/**
 * 一个典型类的定义和使用
 *
 * @author centuryw
 */
public class Stu {
    int id, age;
    String name;
    Computer computer;

    void study() {
        System.out.println("正在使用" + computer.brand + "电脑学习...");
    }

    Stu() {

    }

    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.id = 133;
        stu.name = "张三";
        Computer computer1 = new Computer("惠普");
        stu.age = 24;
        stu.computer = computer1;
        stu.study();
    }


}

class Computer {
    Computer(String brand) {
        this.brand = brand;
    }

    String brand;
}