package part7.lesson165;

import java.util.ArrayList;
import java.util.List;

/***
 * @title javabean和list结合存储表格数据
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 14:09
 **/
public class Test {
    public static void main(String[] args) {
        User user1 = new User(1001, "user1", 20, 2000);
        User user2 = new User(1002, "user2", 30, 3000);
        User user3 = new User(1003, "user3", 34,4000);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println(list);
    }
}

class User {
    private int id;
    private String name;
    private int age;
    private double salary;

    /**
     * 完整的javabean要有set和get方法以及无参构造
     */
    public User() {

    }

    public User(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}