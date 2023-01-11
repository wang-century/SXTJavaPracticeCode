package part1;

/**
 * 方法的定义、形参、实参、返回值
 * 注：Java中进行方法调用中传递参数时，遵循值传递的原则（传递的都是数据的副本）
 *
 * @author centuryw
 */
public class Practice22 {
    public static void main(String[] args) {
        Practice22 obj = new Practice22();
        obj.printText("你好世界");
        System.out.println(obj.add(1, 2, 3));
    }

    /**
     * 无返回值方法
     *
     * @param text 字符串内容
     */
    void printText(String text) {
        System.out.println(text);
    }

    /**
     * 三个值相加
     * @param a 值a
     * @param b 值b
     * @param c 值c
     * @return 相加结果
     */
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
