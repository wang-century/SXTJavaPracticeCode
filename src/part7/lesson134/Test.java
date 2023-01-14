package part7.lesson134;

import java.util.ArrayList;
import java.util.Collection;

/***
 * @title 测试Collection接口中的方法
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 15:00
 **/
public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        System.out.println(c.isEmpty());    // 判断是否为空   true
        c.add("张三");    // 添加元素
        c.add("里斯");
        c.add("李四");
        System.out.println(c.size());   // 3
        c.remove("里斯"); // 移除对象：只是把存的地址删除了，对象并没有被释放
        System.out.println(c);  // [张三, 李四]
        System.out.println(c.contains("李四"));   // 是否包含 true
        c.clear();  // 清空
        System.out.println(c.size());   // 0
    }
}
