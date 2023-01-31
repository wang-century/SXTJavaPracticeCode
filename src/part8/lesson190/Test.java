package part8.lesson190;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/***
 * @title CommonsIO的使用
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 13:22
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        // 文件大小
        long len = FileUtils.sizeOf(new File("src/files/a.png"));
        System.out.println(len);
        // 目录大小
        len = FileUtils.sizeOf(new File("src/files"));
        System.out.println(len);
        // 列出子孙级 增加查询条件
        // FileUtils.listFiles(new File("src/files"), EmptyFileFilter.NOT_EMPTY, null).forEach(System.out::println);   // 过滤空文件
        System.out.println("-----");
        // FileUtils.listFiles(new File("src/files"), new SuffixFileFilter("txt"), DirectoryFileFilter.INSTANCE).forEach(System.out::println); // 只要txt文件
        System.out.println("-----");
        // FileUtils.listFiles(new File("src/files"), FileFilterUtils.or(new SuffixFileFilter("png"),new SuffixFileFilter("txt")), DirectoryFileFilter.INSTANCE).forEach(System.out::println); // 只要png或txt文件
        System.out.println("-----");
        // 读取内容 读取文件
        String content = FileUtils.readFileToString(new File("src/files/b.txt"), "UTF-8");  // 读取字符
        // System.out.println(content);
        byte[] content_bytes = FileUtils.readFileToByteArray(new File("src/files/b.txt")); // 读取字节
        System.out.println(content_bytes.length);
        // 逐行读取
        List<String> line_list = FileUtils.readLines(new File("src/files/b.txt"), "UTF-8");
        // line_list.forEach(System.out::println);
        // 写出内容
        FileUtils.write(new File("src/files/c.txt"), "写出内容", "UTF-8", true); // 追加写出字符串到文件
        FileUtils.writeByteArrayToFile(new File("src/files/d.txt"), "写出内容".getBytes(StandardCharsets.UTF_8), true); // 追加写出字符数组到文件
        // 写出列表
        List<String> list_data = new ArrayList<>();
        list_data.add("写出内容1");
        list_data.add("写出内容2");
        FileUtils.writeLines(new File("src/files/e.txt"), "UTF-8", list_data, ";"); // 追加写出字符串列表到文件 每条数据的间隔符为;
        // 拷贝文件
        FileUtils.copyFile(new File("src/files/a.png"), new File("src/files/a_copy.png"));
        // 拷贝文件到目录
        FileUtils.copyFileToDirectory(new File("src/files/a.png"), new File("src/files/copy"));
        // 拷贝目录
        // FileUtils.copyDirectoryToDirectory(new File("src/files/"), new File("src/files_copy/"));
        // 拷贝URL内容
        // FileUtils.copyURLToFile(new URL("https://commons.apache.org/proper/commons-io/images/commons-logo.png"), new File("src/files/apache.png"));
        // String urlContent = IOUtils.toString(new URL("https://www.baidu.com"), StandardCharsets.UTF_8);
        // System.out.println(urlContent);

    }
}
