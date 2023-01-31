package part8.lesson187;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/***
 * @title 文件分割
 * @description 随机读取和写入流 RandomAccessFile
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 10:26
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        //test01();
        //test02();
        /* 分多少块 */
        File src = new File("src/files/a.txt");
        // 总长度
        long len = src.length();
        // 块大小
        int blockSize = 1024;
        // 分的块数
        int size = (int) Math.ceil(len * 1.0 / blockSize);
        System.out.println(len + "," + size);
        // 起始位置和实际大小
        int beginPos = 0;
        int actualSize = (int) (blockSize > len ? len : blockSize);
        for (int i = 0; i < size; i++) {
            beginPos = i * blockSize;
            if (i == size - 1) {
                actualSize = (int) len;
            } else {
                actualSize = blockSize;
                len -= actualSize;
            }
            System.out.println(i + " --> " + beginPos + " --> " + actualSize + " --> " + len);
        }
    }

    /**
     * 指定起始位置 分段读取剩余所有内容
     */
    public static void test01() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("src/files/a.txt"), "r");
        // 指定起始位置
        raf.seek(3);
        // 分段读取剩余所有内容
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len = raf.read(flush)) != -1) {
            System.out.println(new String(flush, 0, len));
        }
        raf.close();
    }

    /**
     * 指定起始位置 分段读取指定长度内容
     */
    public static void test02() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("src/files/a.txt"), "r");
        // 指定起始位置
        int beginPos = 4;
        int actualSize = 1028;
        raf.seek(beginPos);
        // 分段读取剩余所有内容
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len = raf.read(flush)) != -1) {
            if (actualSize > len) {
                System.out.println(new String(flush, 0, len));
                actualSize -= len;
            } else {
                System.out.println(new String(flush, 0, actualSize));
                break;
            }
        }
        raf.close();
    }
}
