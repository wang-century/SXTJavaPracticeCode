package part8.lesson179;

import java.io.*;

/***
 * @title 工具类
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/29 11:20
 **/
public class FileUtils {
    public static void main(String[] args) {
        // 测试文件到文件
        try {
            InputStream is = new FileInputStream("src/files/a.png");
            OutputStream os = new FileOutputStream("src/files/c.png");
            copy(is, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 对接输入输出流
     *
     * @param is 输入流
     * @param os 输出流
     */
    public static void copy(InputStream is, OutputStream os) {
        try{
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(is, os);
        }
    }

    /**
     * 释放资源
     *
     * @param is 输入流
     * @param os 输出流
     */
    public static void close(InputStream is, OutputStream os) {
        try {
            if (os != null) {
                os.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 释放资源
     * @param ios io流
     */
    public static void close(Closeable... ios){
        for (Closeable io:ios){
            try {
                if (io != null) {
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
