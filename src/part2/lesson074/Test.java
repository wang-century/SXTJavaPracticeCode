package part2.lesson074;

import part2.lesson063.Stu;

/***
 * @title 继承的实现和instanceOf的使用
 * @description instanceOf用于判断对象是否是指定类的对象
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 13:31
 **/
public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", "实验", 20);
        student.rest();
        System.out.println(student instanceof Student); // true
        System.out.println(student instanceof Person);  // true
    }
}


class Person {
    String name;
    int age;

    public void rest() {
        System.out.println("休息一会");
    }
}

class Student extends Person {
    String school;

    public Student(String name, String school, int age) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void study() {
        System.out.println("学习一会");
    }
}