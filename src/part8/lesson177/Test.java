package part8.lesson177;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/***
 * @title 字节数组流
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/29 10:53
 **/
public class Test {
    public static void main(String[] args) {
        outputTest();
    }

    /**
     * 输入流
     */
    static void inputTest() {
        byte[] bytes = "Life is pain, hope falls".getBytes();   // 字符串转字节数组
        InputStream inputStream = new ByteArrayInputStream(bytes);
        byte[] flush = new byte[5]; // 缓冲容器
        int len = -1;
        try {
            while ((len = inputStream.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 输出流
     */
    static void outputTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            String str = "Life is pain, hope falls";
            byte[] bytes = str.getBytes();
            // 写数据
            baos.write(bytes, 0, bytes.length);
            baos.flush();
            // 读数据
            byte[] data = baos.toByteArray();
            System.out.println(data.length + "-->" + new String(data, 0, data.length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
