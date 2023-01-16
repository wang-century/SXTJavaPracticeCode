package part7.lesson160;

import java.util.Set;
import java.util.TreeSet;

/***
 * @title TreeSet的使用
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 13:13
 **/
public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        // 打印输出
        System.out.println(treeSet);

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee(100, "John", 3000));
        employeeSet.add(new Employee(300, "Jill", 4000));
        employeeSet.add(new Employee(200, "Jack", 4000));
        employeeSet.add(new Employee(400, "Q", 20000));
        System.out.println(employeeSet);
    }
}




class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @param o 要比较的对象
     * @return 0相等、-1小于、正数大于
     */
    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary) {
            return 1;
        } else if (this.salary == o.salary) {
            return Integer.compare(this.id, o.id);
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}