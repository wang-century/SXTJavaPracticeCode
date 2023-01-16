package part7.lesson157;

import java.util.Map;
import java.util.TreeMap;

/***
 * @title TreeMap的使用
 * @description HashMap线程不安全，效率高，允许key或value为null
 *              HashTable线程安全，效率低，不允许key或value为null
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 12:50
 **/
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(20, "aa");
        treeMap.put(30, "bb");
        treeMap.put(40, "cc");
        // 按照key递增的方式排序
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + ":" + treeMap.get(key));
        }
        Map<Employee, String> employeeStringMap = new TreeMap<>();
        employeeStringMap.put(new Employee(1, "张三", 1000), "张三工作积极");
        employeeStringMap.put(new Employee(2, "李四", 2000), "李四人不错");
        employeeStringMap.put(new Employee(3, "王五", 3000), "王五性格不错");
        employeeStringMap.put(new Employee(4, "赵六", 3000), "赵六性格不错");
        for (Employee key : employeeStringMap.keySet()) {
            System.out.println(key + ":" + employeeStringMap.get(key));
        }

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