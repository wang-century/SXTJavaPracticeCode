package part8.lesson186;

import java.io.*;

/***
 * @title 打印流
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 10:06
 **/
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //testPrintStream();
        testPrintWriter();
    }
    public static void testPrintStream() throws FileNotFoundException {
        // 打印到控制台
        PrintStream ps = System.out;
        ps.println("Hello World");
        ps.println(true);
        // 打印到文件
        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("src/files/d.txt")), true);
        ps.println("Hello World");
        ps.println(true);
        // 重定向输出端
        System.setOut(ps);
        System.out.println("change");
        // 重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
        System.out.println("back");
        // 关闭流
        ps.close();
    }

    public static void testPrintWriter(){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello World");
        pw.println(true);
    }
}
