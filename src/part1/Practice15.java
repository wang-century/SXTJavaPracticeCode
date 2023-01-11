package part1;

/**
 * while循环
 *
 * @author centuryw
 */
public class Practice15 {
    public static void main(String[] args) {
        // 计算1-100之间的累加和
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("和为：" + sum);
    }
}
