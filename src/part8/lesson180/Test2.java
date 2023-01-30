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
public class Test2 {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        Drink sugar = new Sugar(coffee);
        System.out.println(sugar.info() + "，总费用：" + sugar.cost());
        Drink milk = new Milk(coffee);
        System.out.println(milk.info() + "，总费用：" + milk.cost());
        Drink milkSugar = new Sugar(milk);
        System.out.println(milkSugar.info() + "，总费用：" + milkSugar.cost());
    }
}

interface Drink {
    double cost();  // 费用

    String info();  // 说明
}

class Coffee implements Drink {
    private String name = "咖啡";

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }
}

/**
 * 抽象装饰类
 */
abstract class Decorate implements Drink {
    // 对抽象组件的引用
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return this.drink.cost();
    }

    @Override
    public String info() {
        return this.drink.info();
    }
}

class Milk extends Decorate {
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost() + 5;
    }

    @Override
    public String info() {
        return super.info() + "加入了牛奶";
    }
}

class Sugar extends Decorate {
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost() + 3;
    }

    @Override
    public String info() {
        return super.info() + "加入了糖";
    }
}