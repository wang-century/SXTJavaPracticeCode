package part1;

import java.util.Scanner;

/**
 * 获取键盘输入Scanner
 *
 * @author centuryw
 */
public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("***********\n姓名："+name+"\t年龄："+age);
    }
}
