package part5.lesson115;

/***
 * @title StringBuilder可变字符序列
 * @description StringBuilder线程不安全，效率高(一般使用它）; StringBuffer线程安全，效率低
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 9:38
 **/
public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("张三");
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(1, '四');
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));
        System.out.println(stringBuilder);
    }
}
