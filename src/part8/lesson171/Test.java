package part8.lesson171;

import java.io.UnsupportedEncodingException;

/***
 * @title 编码与解码
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 14:44
 **/
public class Test {
    public static void main(String[] args) {
        String message = "生命无价";
        // 编码：字节数组
        byte[] bytes = message.getBytes();  // 默认使用工程的字符集
        System.out.println(bytes.length);   // 12
        // 编码：指定字符集
        try {
            bytes = message.getBytes("GBK");
            System.out.println(bytes.length);   // 8
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        // 解码：字符串
        try {
            message = new String(bytes, 0, bytes.length, "GBK");
            System.out.println(message);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
