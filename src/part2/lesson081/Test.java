package part2.lesson081;

/***
 * @title 多态的使用
 * @description 1.多态是方法的多态，不是属性的多态(多态与属性无关)。
 *              2.多态的存在要有3个必要条件:继承，方法重写，父类引用指向子类对象。
 *              3.父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了。
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 14:20
 **/
public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.shout();
        Animal a2 = new Dog();
        a2.shout();
        Dog dog = (Dog) a2;
        dog.guard();
    }
}


class Animal{
    public void shout(){
        System.out.println("吼叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    public void guard(){
        System.out.println("看门中");
    }
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
