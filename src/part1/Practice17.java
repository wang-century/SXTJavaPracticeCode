package part1;

/**
 * for循环
 *
 * @author centuryw
 */
public class Practice17 {
    public static void main(String[] args) {
        // 计算1-100之间的累加和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // for写无限循环
        for (; ; ) {
            System.out.println("循环");
        }
    }
}
