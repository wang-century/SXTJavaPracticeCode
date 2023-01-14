package part4.lesson102;

/***
 * @title 抽象类、抽象方法
 * @description 抽象类的意义就在于:为子类提供统一的、规范的模板。子类必须实现相关的抽象方法!
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/13 16:17
 **/
public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.shout();
    }
}
/**
 * 抽象类
 * 包含抽象方法的类就是抽象类。通过abstract方法定义规范，然后要求子类必须定义具体实现
 * 通过抽象类，我们就可以做到严格限制子类的设计，使子类之间更加通用。
 */
abstract class Animal{
    /**
     * 抽象方法
     * 使用abstract修饰的方法，没有方法体，只有声明。定义的是一种“规范”，就是告诉子类必须要给抽象方法提供具体的实现。
     * 特点：
     *  1.没有实现
     *  2.子类必须实现
     */
    abstract void shout();
}

class Dog extends Animal{

    /**
     * 必须实现抽象方法
     */
    @Override
    void shout() {
        System.out.println("汪汪汪");
    }
}
