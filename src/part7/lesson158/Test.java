package part7.lesson158;

import java.util.HashSet;
import java.util.Set;

/***
 * @title HashSet的使用
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 13:07
 **/
public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("aa");
        System.out.println(set);    // [aa, bb, cc]
        set.remove("aa");
        System.out.println(set);    // [bb, cc]
        Set<String> set1 = new HashSet<>();
        set1.add("张三");
        set1.add("李四");
        set1.addAll(set);
        System.out.println(set1);   // [bb, cc, 李四, 张三]
    }
}
