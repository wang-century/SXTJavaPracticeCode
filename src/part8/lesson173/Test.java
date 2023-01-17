package part8.lesson173;

import java.io.*;

/***
 * @title IO标准步骤
 * @description 1.创建源 --> 2.选择流 --> 3.操作 --> 4.释放资源
 *
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 14:55
 **/
public class Test {
    public static void main(String[] args) {
        // readOneByOne();
        // readByBuffer();
        write();
    }

    /**
     * 逐个字节读取
     */
    public static void readOneByOne(){
        // 1.创建源
        File file = new File("README.md");
        // 2.选择流
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            // 3.操作（读取）
            int temp;
            while ((temp = inputStream.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (inputStream != null){
                // 4.释放资源
                try {
                    inputStream.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 分批读取
     */
    public static void readByBuffer(){
        // 1.创建源
        File file = new File("README.md");
        // 2.选择流
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            // 3.操作（读取）
            byte[] buffer = new byte[1024];    // 缓冲容器
            int len = -1;   // 接收长度
            while ((len=inputStream.read(buffer)) != -1) {
                // 解码
                String string = new String(buffer, 0, len); // 只转化读取的长度
                System.out.print(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (inputStream != null){
                // 4.释放资源
                try {
                    inputStream.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void write(){
        // 1.创建源
        File file = new File("src/files/a.txt");
        // 2.选择流
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);  // 从起始位置写出
            // outputStream = new FileOutputStream(file, true); // 追加写出
            // 3.操作（写出）
            String message = "你好啊，世界！";
            byte[] bytes = message.getBytes();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.flush();   // 刷新缓存

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (outputStream != null){
                // 4.释放资源
                try {
                    outputStream.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
