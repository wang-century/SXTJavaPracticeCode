package part7.lesson164;

import java.util.*;

/***
 * @title 使用容器存储表格数据
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 14:03
 **/
public class Test {
    public static void main(String[] args) {
        Map<String, Object> row1 = new HashMap<>();
        row1.put("id", 1001);
        row1.put("name", "Lily");
        row1.put("salary", 4000);
        Map<String, Object> row2 = new HashMap<>();
        row2.put("id", 1002);
        row2.put("name", "Tom");
        row2.put("salary", 3000);
        Map<String, Object> row3 = new HashMap<>();
        row3.put("id", 1003);
        row3.put("name", "Jack");
        row3.put("salary", 2000);
        List<Map<String, Object>> table = new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        for (Map<String, Object> row : table) {
            Set<String> keys = row.keySet();
            for (String key : keys) {
                System.out.print(key + ":" + row.get(key)+"\t");
            }
            System.out.println();
        }

    }
}
