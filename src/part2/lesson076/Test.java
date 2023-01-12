package part2.lesson076;

/***
 * @title 重写toString方法
 * @description
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 13:47
 **/
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 20;
        person.name = "李东";
        System.out.println("信息:"+person);   // 信息:李东, 年龄:20
        Test test = new Test();
        System.out.println(test);   // part2.lesson076.Test@34c45dca
    }
}

class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return name + ", 年龄:" + age;
    }
}



