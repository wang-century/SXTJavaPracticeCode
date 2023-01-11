package part1;

/**
 * 带标签的break和continue
 *
 * @author centuryw
 */
public class Practice21 {
    public static void main(String[] args) {
        // 打印101-150之间的所有质数
        outer:
        for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
