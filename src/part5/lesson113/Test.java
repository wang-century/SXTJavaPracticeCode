package part5.lesson113;

/***
 * @title 包装类
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 9:21
 **/
public class Test {
    public static void main(String[] args) {
        // 基本类型转化为Integer对象
        Integer a = 3;  // 包装类Integer
        Integer b = Integer.valueOf(30);
        // Integer对象转化成int
        int c = b.intValue();
        // 字符串转成Integer对象
        Integer d = Integer.parseInt("334");
        Integer e = Integer.valueOf("321");
        // Integer对象转为字符串
        String str1 = e.toString();
        System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);
    }
}
