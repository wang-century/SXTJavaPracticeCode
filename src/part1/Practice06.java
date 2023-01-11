package part1;

/**
 * 基本数据类型
 * 数值：byte、short、int、long、float、double
 * 字符：char
 * 布尔：boolean
 *
 * @author centuryw
 */
public class Practice06 {
    /**
     * 测试整形变量
     */
    static void testIntegerVariable(){
        int a = 15;     // 十进制
        int b = 015;    // 0开头为8进制
        int c = 0x15;   // 0x开头为15进制
        int d = 0b11;   // 0b开头为二进制
        System.out.println("测试整形变量:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        byte age = 30;
        short salary = 30000;
        int population = 20000000;
        long globalPopulation = 740000000L; // 后面加L代表是Long类型的常量
    }

    public static void main(String[] args) {
        testIntegerVariable();
    }
}
