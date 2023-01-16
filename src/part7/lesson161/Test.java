package part7.lesson161;

import java.util.*;

/***
 * @title 迭代器的使用
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 13:48
 **/
public class Test {
    public static void main(String[] args) {
        // 遍历列表
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        // 使用迭代器遍历
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
            System.out.print(temp + "\t");
        }
        System.out.println();
        // 遍历集合
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        // 使用迭代器遍历
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
            System.out.print(temp + "\t");
        }
        System.out.println();
        // 遍历Map
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        // 使用迭代器遍历
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");
        }
        System.out.println();
    }
}
