package part5.lesson121;

/***
 * @title Math类常用方法
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 10:33
 **/
public class Test {
    public static void main(String[] args) {
        // 取整
        System.out.println(Math.ceil(3.42));    // 返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数  4.0
        System.out.println(Math.floor(3.42));   // 返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数  3.0
        System.out.println(Math.round(3.42));   // 返回最接近参数的 int。结果将舍入为整数    3
        System.out.println(Math.round(3.53));   // 返回最接近参数的 int。结果将舍入为整数    4
        // 绝对值、开方、a的b次幂
        System.out.println(Math.abs(-45));  // 绝对值  45
        System.out.println(Math.sqrt(64));  // 开方   8.0
        System.out.println(Math.pow(5, 2)); // 返回第一个参数的第二个参数次幂的值    25.0
        System.out.println(Math.pow(2, 5));  // 返回第一个参数的第二个参数次幂的值    32.0
        // Math类常用常量
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // 随机数
        System.out.println(Math.random());  // [0,1)
    }
}
