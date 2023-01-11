package part1;

/**
 * 使用while循环分别计算100以内的基数及偶数的和
 *
 * @author centuryw
 */
public class Practice19 {
    public static void main(String[] args) {
        int odd_sum = 0;    // 存放奇数
        int even_num = 0;   // 存放偶数
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                even_num += i;
            } else {
                odd_sum += i;
            }
            i++;
        }
        System.out.println("奇数和："+odd_sum);
        System.out.println("偶数和："+even_num);
    }
}
