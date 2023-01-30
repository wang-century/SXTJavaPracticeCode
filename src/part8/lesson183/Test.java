package part8.lesson183;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * InputStreamReader/OutputStreamWriter:
 * 是字节流与字符流之间的桥梁，能将字节流转换为字符流，并且能为字节流指定字符集，可处理一个个的字符
 */
public class Test {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    /**
     * 获取键盘输入并输出
     */
    public static void task1() {
        // 操作System.in和System.out
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
            // 循环获取键盘输入 exit退出 输出此内容
            String msg = "";
            while (!msg.equals("exit")) {
                msg = bufferedReader.readLine();
                bufferedWriter.write(msg);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 操作网络流，指定字符集
     */
    public static void task2() {
        // 操作网络流，下载百度源码
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://www.baidu.com").openStream(), StandardCharsets.UTF_8))) {
            String msg = "";
            while (null != (msg = bufferedReader.readLine())) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
