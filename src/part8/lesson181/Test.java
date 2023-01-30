package part8.lesson181;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节缓冲流
 * 1.提升性能
 * 2.会自动释放节点流
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建源 选择流
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/files/a.txt"))) {
            // 3.操作
            byte[] flush = new byte[1024];
            int len = 0;
            while (-1 != (len = bufferedInputStream.read(flush))) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
