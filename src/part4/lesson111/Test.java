package part4.lesson111;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Test {
    public static void main(String[] args) {
        int temp;
        int[] values = {1, 3, 2, 10, 8, 5, 6, 4, 5, 0};
        for (int i = 0; i < values.length - 1; i++) {
            boolean flag = true;    // 用于判断本次循环是否发生了交换，如果没有发生交换代表排序已经完成
            for (int j=0; j<values.length-1-i;j++){
                // 判断并交换位置
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
