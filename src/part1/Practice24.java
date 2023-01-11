package part1;

/**
 * 递归：计算n的阶乘
 * 注：
 * 递归就是自己调用自己
 * 递归包含两个部分：递归头、递归体
 *
 * @author centuryw
 */
public class Practice24 {
    public static void main(String[] args) {
        long dStart = System.currentTimeMillis();
        System.out.println(factorial(10));
        long dEnd = System.currentTimeMillis();
        System.out.println("耗时：" + (dEnd - dStart));
        dStart = System.currentTimeMillis();
        long result = 1;
        for (int i=1; i<=10; i++){
            result *= i;
        }
        dEnd = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("耗时：" + (dEnd - dStart));
    }

    /**
     * 求阶乘
     *
     * @param n n
     * @return 结果
     */
    static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
