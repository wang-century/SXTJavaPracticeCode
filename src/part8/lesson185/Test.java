package part8.lesson185;

import java.io.*;
import java.util.Date;

/***
 * @title 对象流(序列化与反序列化)
 * @description 1、写出后读取
 *              2、读取的顺序与写出保持—致
 *              3. 不是所有对象都可以序列化 需要继承Serializable
 *              DataOutputStream
 *              DataInputStream
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 9:51
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
        // 操作数据类型+数据
        oos.writeUTF("编码辛酸泪");
        oos.writeInt(19);
        oos.writeBoolean(false);
        oos.writeChar('a');
        oos.flush();
        // 操作对象
        oos.writeObject("字符串");
        oos.writeObject(new Date());
        oos.writeObject(new Student(19, "张三"));
        oos.flush();
        // 读取
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(baos.toByteArray())));
        // 顺序与写出一致
        String msg = ois.readUTF();
        int age = ois.readInt();
        boolean flag = ois.readBoolean();
        char ch = ois.readChar();
        // 读取对象
        String str = (String) ois.readObject();
        Date date = (Date) ois.readObject();
        Student stu = (Student) ois.readObject();
        System.out.println(msg + " " + age + " " + flag + " " + ch);    // 编码辛酸泪 19 false a
        System.out.println(str + " " + date + " " + stu.age + " " + stu.name);    // 字符串 Tue Jan 31 10:00:00 CST 2017 19 null
    }
}

class Student implements Serializable{
    int age;
    transient String  name; // 不想序列化的属性
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
