package part1;

import java.math.BigDecimal;

/**
 * 浮点型变量和BigDecimal
 *
 * @author centuryw
 */
public class Practice07 {
    public static void main(String[] args) {
        // 使用科学计数法给浮点类型变量赋值
        double f1 = 314e2;   // 314*100
        double f2 = 314e-2;     // 314*-100
        System.out.println("使用科学计数法给浮点类型变量赋值:");
        System.out.println(f1);
        System.out.println(f2);
        // float类型赋值时需要添加后缀F
        float f3 = 3.14F;
        // 浮点数是不精确的，一定不能做比较
        float f4 = 0.1f;
        double d1 = 1.0 / 10;
        System.out.println("浮点数是不精确的，一定不能做比较:");
        System.out.println(f4 == d1); // 结果为false
        // 如果浮点数需要比较，需要使用特殊类BigInteger和BigDecimal
        BigDecimal bd = BigDecimal.valueOf(1.0);    // 定义变量
        bd = bd.subtract(BigDecimal.valueOf(0.1));  // 减去0.1
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println("如果浮点数需要比较，需要使用特殊类BigInteger和BigDecimal:");
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);  // 0.5000000000000001
        System.out.println(bd); // 0.5
        // 使用精确浮点做对比
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(1.0 / 10);
        System.out.println("使用精确浮点做对比:");
        System.out.println(bd1.equals(bd2));    // 作比较
    }
}
