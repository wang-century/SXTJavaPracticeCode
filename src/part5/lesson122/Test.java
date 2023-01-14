package part5.lesson122;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/***
 * @title File类的使用
 * @description 文件和目录
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 10:44
 **/
public class Test {
    public static void main(String[] args) {
        // createFile();
        // 访问文件属性
        File file = new File(System.getProperty("user.dir") + "/README.md");
        System.out.println("是否存在：" + file.exists());
        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
        System.out.println("大小：" + file.length());
        System.out.println("文件名：" + file.getName());
        System.out.println("目录路径：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsoluteFile());
        // 创建目录
        createDirectory();
    }

    /**
     * 文件的创建和删除
     */
    public static void createFile() {
        System.out.println(System.getProperty("user.dir")); // 获取当前工作目录
        File file = new File("a.txt");  // 相对路径，默认放到当前工作目录下
        File file1 = new File("D:/c.txt");  // 绝对路径
        try {
            // 创建文件
            file.createNewFile();
            file1.createNewFile();
            // 删除文件
            file.delete();
            file1.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 目录的创建
     */
    public static void createDirectory() {
        File file = new File("testDir/p1");
        // 使用mkdir创建目录：如果指定的递归目录不存在则不会递归创建
        boolean flag = file.mkdir();   // 创建目录
        System.out.println(flag);   // 创建结果 false
        // 使用mkdirs创建目录：会递归创建
        flag = file.mkdirs();
        System.out.println(flag);
    }


}
