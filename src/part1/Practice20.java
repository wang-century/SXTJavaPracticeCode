package part1;

/**
 * 使用while循环输出1-1000之间能被5整除的数，且每行输出5个
 *
 * @author centuryw
 */
public class Practice20 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;  // 统计是否有5个
        StringBuilder str = new StringBuilder();
        while (i <= 1000) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % 25 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
