package part1;

/**
 * 位运算
 *
 * @author centuryw
 */
public class Practice09 {
    public static void main(String[] args) {
        // 与或非异或
        int a = 3;
        int b = 4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        // 左移运算和右移运算
        // 计算10*2
        System.out.println(10*2);
        System.out.println(10<<1);  // 左移一位相当于乘以2
        // 计算10/2
        System.out.println(10/2);
        System.out.println(10>>1);  // 右移一位相当于除以2
    }
}
