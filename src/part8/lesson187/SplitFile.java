package part8.lesson187;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/***
 * @title 分割文件 面向对象
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 11:19
 **/
public class SplitFile {
    private File srcFile; // 源文件路径
    private String destDir; // 目标文件夹路径
    private List<String> destPaths; // 分割后的文件存储路径
    private int blockSize; // 每块大小
    private int size; // 块数

    public SplitFile(File srcFile, String destDir, int blockSize) {
        this.srcFile = srcFile;
        this.destDir = destDir;
        this.blockSize = blockSize;
        this.destPaths = new ArrayList<String>();
        init();
    }

    /**
     * 初始化
     */
    private void init(){
        long len = this.srcFile.length();   // 总长度
        this.size = (int) Math.ceil(len * 1.0 / blockSize); // 分的块数
        // 路径
        for (int i = 0; i < size; i++) {
            this.destPaths.add(this.destDir + "/" + i + "-" + this.srcFile.getName());
        }
    }

    /**
     * 分割
     * 1. 计算每一块的起始位置和实际大小
     * 2. 分割
     */
    private void split(){
        long len = this.srcFile.length();   // 总长度

    }
}
