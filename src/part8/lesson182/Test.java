package part8.lesson182;

import java.io.*;

/**
 * 字符缓冲流
 * 1.提升性能
 * 2.会自动释放节点流
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建源 选择流
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/files/a.txt"))) {
            // 3.操作 逐行读取
            String line = null;
            while (null != (line = bufferedReader.readLine())) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
