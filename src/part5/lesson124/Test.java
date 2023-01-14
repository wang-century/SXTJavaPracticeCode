package part5.lesson124;

/***
 * @title 枚举
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 11:09
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        Season a = Season.WINTER;
        switch (a){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

    }
}

/**
 * 季节枚举
 */
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
