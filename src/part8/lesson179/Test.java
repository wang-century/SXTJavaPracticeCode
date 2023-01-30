package part8.lesson179;

import java.io.*;

/***
 * @title Try with source
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/29 11:33
 **/
public class Test {
    public static void main(String[] args) {
        // try with source
        try (InputStream is = new FileInputStream("src/files/a.png"); OutputStream os = new FileOutputStream("src/files/d.png")) {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
