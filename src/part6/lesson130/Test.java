package part6.lesson130;

/***
 * @title 自定义异常
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 11:29
 **/
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-10);
    }
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            try {
                throw new IllegalAgeException("年龄不能为负数");
            } catch (IllegalAgeException e) {
                e.printStackTrace();
            }
        }
        this.age = age;
    }

}


class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String msg) {
        super(msg);
    }

}