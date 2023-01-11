package part1;

/**
 * 方法的重载
 * 注：
 *      方法名相同，参数个数/类型/顺序不同，构成重载;
 *      只有返回值不同不构成重载
 *
 * @author centuryw
 */
public class Practice23 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    /**
     * 两个值相加
     *
     * @param a 值a
     * @param b 值b
     * @return 相加结果
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * 三个值相加
     *
     * @param a 值a
     * @param b 值b
     * @param c 值c
     * @return 相加结果
     */
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
