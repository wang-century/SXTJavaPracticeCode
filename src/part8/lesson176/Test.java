package part8.lesson176;

import java.io.*;

/***
 * @title 文件字符流
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 15:26
 **/
public class Test {
    public static void main(String[] args) {
        //reader();
        write();
    }

    /**
     * 读入
     */
    public static void reader(){
        // 1.创建源
        File file = new File("README.md");
        // 2.选择流
        Reader reader = null;
        try {
            reader = new FileReader(file);
            // 3.操作（读取）
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = reader.read(buffer))!= -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (reader != null){
                // 4.释放资源
                try {
                    reader.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 写出
     */
    public static void write(){
        // 1.创建源
        File file = new File("src/files/c.txt");
        // 2.选择流
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            // 3.操作（写出）
            String message = "我手拿弯月刀\n";
            writer.write(message);
            writer.append("喊着响亮的口号,").append("前方何人报上名");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (writer != null){
                // 4.释放资源
                try {
                    writer.close();    // 通知操作系统可以释放
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
