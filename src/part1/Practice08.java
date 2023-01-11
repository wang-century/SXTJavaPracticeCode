package part1;

/**
 * 字符型变量/常量
 *
 * @author centuryw
 */
public class Practice08 {
    public static void main(String[] args) {
        char a = 'T';
        char b = '张';
        char c = '\u0061';  // a
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // 转义字符
        System.out.println('a' + 'b');  // 195
        System.out.println("" + 'a' + '\t' + 'b');  // a	b

    }
}
