package part8.lesson184;

import java.io.*;

/***
 * @title 数据流
 * @description 1、写出后读取
 *              2、读取的顺序与写出保持—致
 *              DataOutputStream
 *              DataInputStream
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 9:40
 **/
public class Test {
    public static void main(String[] args) {
        // 写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
        // 操作数据类型+数据
        try {
            dos.writeUTF("编码辛酸泪");
            dos.writeInt(19);
            dos.writeBoolean(false);
            dos.writeChar('a');
            dos.flush();
            byte[] data = baos.toByteArray();   // 获取数据
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 读取
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(baos.toByteArray())));
        // 顺序与写出一致
        try {
            String msg = dis.readUTF();
            int age = dis.readInt();
            boolean flag = dis.readBoolean();
            char ch = dis.readChar();
            System.out.println(msg + " " + age + " " + flag + " " + ch);    // 编码辛酸泪 19 false a
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
