package part7.lesson163;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * @title Collections工具类
 * @description 提供了对Set、List、Map进行排序、填充、查找元素的辅助方法
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 13:55
 **/
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("a" + i);
        }
        System.out.println(list);
        Collections.shuffle(list);  // 随机排列元素
        System.out.println(list);
        Collections.sort(list);  // 按照指定的顺序排序
        System.out.println(list);
        Collections.reverse(list); // 逆序
        System.out.println(list);
        Collections.reverse(list); // 逆序
        System.out.println(Collections.binarySearch(list, "a2"));    // 二分法查找
    }
}
