package part1;

/**
 * 强制类型转换
 *
 * @author centuryw
 */
public class Practice11 {
    public static void main(String[] args) {
        double x = 3.14;
        int nx = (int)x;    // 3
        char c = 'a';
        int d = c+1;
        System.out.println(nx); // 3
        System.out.println(d);  // 98
        System.out.println((char)d);    // b
    }
}
