package part7.lesson135;

import java.util.ArrayList;
import java.util.List;

/***
 * @title ArrayList操作多个List、并集和交集
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 15:07
 **/
public class Test {
    public static void main(String[] args) {
        test02();
    }

    public static void test01(){
        List<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        List<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("dd");
        list2.add("ee");
        System.out.println("list1:"+list1); // list1:[aa, bb, cc]
        list1.addAll(list2);    // 将指定 collection 中的所有元素都插入到列表中的指定位置
        System.out.println("list1:"+list1); // list1:[aa, bb, cc, aa, dd, ee]
        list1.removeAll(list2); // 从列表中移除指定 collection 中包含的其所有元素
        System.out.println("list1:"+list1); // list1:[bb, cc]
        list1.retainAll(list2); // 仅在列表中保留指定 collection 中所包含的元素
        System.out.println("list1:"+list1); //list1:[]
    }

    public static void test02(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        System.out.println(list);   // [aa, bb, cc, dd]
        list.add(2,"ff");   // 指定位置插入元素
        System.out.println(list);   // [aa, bb, ff, cc, dd]
        list.remove(2); // 删除指定位置元素
        System.out.println(list);   // [aa, bb, cc, dd]
        list.set(2, "gg");  // 替换指定位置元素
        System.out.println(list);   // [aa, bb, gg, dd]
        System.out.println(list.get(3));    // 获取指定索引元素
        System.out.println(list.indexOf("gg")); // 查找指定元素索引，从前往后，没有返-1


    }
}
