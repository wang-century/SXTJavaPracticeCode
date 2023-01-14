package part5.lesson116;

/***
 * @title StringBuilder和stringBuffer用法、字符串拼接的推荐方式
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 9:41
 **/
public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<26;i++){
            stringBuilder.append((char)('a'+i));
        }
        System.out.println(stringBuilder);
        stringBuilder.reverse();    // 倒序
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(3, '我');    // 指定位置设置字符
        System.out.println(stringBuilder);
        stringBuilder.insert(0, '我').insert(0,'爱').insert(0, '你');  // 链式调用
        System.out.println(stringBuilder);
        stringBuilder.delete(7,10); // 删除指定位置范围元素
        System.out.println(stringBuilder);
        // 字符串拼接
        addStr();
    }

    /**
     * 字符串拼接方式(推荐)
     */
    static void addStr(){
        StringBuilder stringBuilder = new StringBuilder();
        long numStart = Runtime.getRuntime().freeMemory();
        System.out.println("剩余内存:"+numStart);
        long timeStart = System.currentTimeMillis();
        for (int i=0;i<5000;i++){
            stringBuilder.append(i);
        }
        long numEnd = Runtime.getRuntime().freeMemory();
        long timeEnd = System.currentTimeMillis();
        System.out.println("占用内存:"+(numEnd-numStart));
        System.out.println("占用时间:"+(timeEnd-timeStart));
    }
}
