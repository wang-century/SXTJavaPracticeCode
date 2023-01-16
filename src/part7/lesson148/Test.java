package part7.lesson148;

import java.util.HashMap;
import java.util.Map;

/***
 * @title HashMap的使用
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 10:32
 **/
public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();  // 定义
        // 存放
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        // 取值
        System.out.println(map.get(1)); // One
        System.out.println(map);    // {1=One, 2=Two, 3=Three}
        System.out.println(map.size()); // 大小
        System.out.println(map.containsKey(2)); // 是否包含某个Key
        System.out.println(map.containsValue("three")); // 是否包含某个value
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(4, "four");
        map1.put(5, "five");
        // 将指定map的数据全部存入本map
        map.putAll(map1);
        System.out.println(map);    // {1=One, 2=Two, 3=Three, 4=four, 5=five}

        Employee employee1 = new Employee(1001, "张三", 4000);
        Employee employee2 = new Employee(1002, "李四", 5000);
        Employee employee3 = new Employee(1003, "王五", 6000);
        Map<Integer, Employee> map2 = new HashMap<>();
        // 存对象
        map2.put(employee1.getId(),employee1);
        map2.put(employee2.getId(),employee2);
        map2.put(employee3.getId(),employee3);
        // 取对象
        Employee emp = map2.get(1003);
        System.out.println(emp.getName());

    }
}

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
