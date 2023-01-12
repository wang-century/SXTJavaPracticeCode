package part2.lesson070;

/***
 * @title 静态初始化快的使用
 * @description 1.上溯到Object类，先执行Object的静态初始化块，再向下执行子类的静态初始化块，直到我们的类的静态初始化块为止。
 *              2.构造方法执行顺序和上面顺序一样!!
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 13:13
 **/
public class User {
    int id;
    String name;
    String pwd;
    static String company;

    static {
        System.out.println("执行类的初始化工作");
        company = "bt";

    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        User user = null;
    }
}
