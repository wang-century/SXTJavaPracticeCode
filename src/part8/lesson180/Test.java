package part8.lesson180;

/***
 * @title 装饰器设计模式
 * @description 1、抽象组件:需要装饰的抽象对象(接口或抽象父类)
 *              2、具体组件:需要装饰的对象
 *              3、抽象装饰类:包含了对抽象组件的引用以及装饰着共有的方法
 *              4、具体装饰类:被装饰的对象
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/30 16:49
 **/
public class Test {
    public static void main(String[] args) {
        // 案例1
        Person person = new Person();
        person.say();
        Amplifier amplifier = new Amplifier(person);
        amplifier.say();
    }
}


interface Say {
    void say();
}


class Person implements Say {
    private int voice = 10; // 人的声音大小

    public int getVoice() {
        return voice;
    }

    @Override
    public void say() {
        System.out.println("I am a person(分贝：" + this.getVoice() + ")");
    }
}

/**
 * 声音放大器
 */
class Amplifier implements Say {
    private Person person;

    Amplifier(Person person) {
        this.person = person;
    }

    @Override
    public void say() {
        System.out.println("I am a person(分贝：" + this.person.getVoice() * 10 + ")");
    }
}

