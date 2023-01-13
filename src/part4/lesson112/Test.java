package part4.lesson112;

/**
 * 二分法查找
 * 前提是已经排序好的数组
 */
public class Test {
    public static void main(String[] args) {
        int[] values = {1, 4, 7, 13, 25, 30, 56, 99, 100};
        int mid, start = 0, end = values.length - 1;
        int searchNumber = 1;
        while (start <= end) {
            mid = (start + end) / 2;
            System.out.println(start + " " + mid + " " + end);
            if (values[mid] == searchNumber) {
                System.out.println("位置为" + mid);
                break;
            }
            if (values[mid] < searchNumber) {
                start = mid + 1;
            }
            if (values[mid] > searchNumber) {
                end = mid - 1;
            }

        }

    }
}
