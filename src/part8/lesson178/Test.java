package part8.lesson178;

import java.io.*;

/***
 * @title 对接流：图片读取到字节数组再将字节数组写入到文件
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/29 11:05
 **/
public class Test {
    public static void main(String[] args) {
        byte[] data = fileToByteArray("src/files/a.png");
        byteArrayToFile(data, "src/files/b.png");
    }

    /**
     * 文件读取到字节数组
     *
     * @param filePath 文件路径
     * @return 字节数组
     */
    public static byte[] fileToByteArray(String filePath) {
        // 创建源
        File src = new File(filePath);
        byte[] dest = null;
        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            inputStream = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
            // 分段读取
            byte[] bytes = new byte[1024 * 10];
            int len = -1;
            while ((len = inputStream.read(bytes)) != -1) {
                baos.write(bytes, 0, len);  // 写出到字节数组
            }
            baos.flush();
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 字节数组写入文件
     *
     * @param byteArray 字节数组
     * @param filePath  文件路径
     */
    public static void byteArrayToFile(byte[] byteArray, String filePath) {
        // 创建源
        File src = new File(filePath);
        InputStream is = null;
        FileOutputStream os = null;
        try {
            is = new ByteArrayInputStream(byteArray);
            os = new FileOutputStream(src);
            // 分段读取
            byte[] bytes = new byte[1024 * 10];
            int len = -1;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);  // 写出到字节数组
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
