package part2.lesson084;

/***
 * @title 数组的使用：声明、存储、读取、foreach循环
 * @description 1.长度是确定的。数组件旦被创建，它的大小就是不可以改变的。3数组类型可以是任何数据类型，包括基本类型和引用类型。
 *              2.其元素必须是相同类型，不允许出现混合类型。
 *              3.数组类型可以是任何数据类型包括基本类型和引用类型
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 14:28
 **/
public class Test {
    public static void main(String[] args) {
        // 声明数组
        int[] array1 = new int[10];     // 长度为10
        String[] array2;
        User[] array3;
        // 存储值
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 5;
        }
        // 读取值
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");     // 0	5	10	15	20	25	30	35	40	45
        }
        // foreach循环：只能读取，不能修改
        for (int j : array1) {
            System.out.print(j + "\t");     // 0	5	10	15	20	25	30	35	40	45
        }

    }
}

class User {

}
