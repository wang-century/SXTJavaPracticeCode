package part8.lesson175;

import java.io.*;

/***
 * @title 文件拷贝
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 15:19
 **/
public class Test {
    public static void main(String[] args) {
        // 1.创建源
        File inputFile = new File("README.md"); // 源文件
        File outputFile = new File("src/files/b.txt");  // 目标文件
        // 2.选择流
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);
            // 3.操作（分段读取并写出）
            byte[] bytes = new byte[1024];  // 缓存容器
            int len = -1;
            while ((len = inputStream.read(bytes))!= -1) {
                outputStream.write(bytes, 0, len);
            }
            outputStream.flush();   // 刷新缓存

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            // 4.释放资源 先打开的后关闭
            if (inputStream!= null){
                try {
                    inputStream.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
