package part2.lesson078;

/***
 * @title super关键字的使用
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 14:05
 **/
public class Test {
    public static void main(String[] args) {
        new Child().f();
    }
}

class Father{
    public int value;
    public void f(){
        value = 100;
        System.out.println("Father.value="+value);
    }
}

class Child extends Father{
    public int value;
    public void f(){
        super.f();  // 调用父类对象的普通方法  Father.value=100
        value = 200;
        System.out.println("Child.value="+value);   // Child.value=200
        System.out.println(value);  // 200
        System.out.println(super.value);    // 调用父类对象的成员变量  100
    }
}