package part1;

/**
 * do-while循环
 *
 * @author centuryw
 */
public class Practice16 {
    public static void main(String[] args) {
        // 计算1-100之间的累加和
        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
    }
}
