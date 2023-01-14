package part5.lesson123;

import java.io.File;

/***
 * @title File类递归打印目录树
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 10:59
 **/
public class Test {
    public static void main(String[] args) {
        printFile(new File("src"), 0);
    }

    public static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println("-" + file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();    // 列出文件列表
            for (File temp : files) {
                printFile(temp, level + 1);
            }
        }
    }
}
