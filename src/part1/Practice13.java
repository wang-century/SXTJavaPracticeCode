package part1;

/**
 * 选择结构
 *
 * @author centuryw
 */
public class Practice13 {
    public static void main(String[] args) {
        double d = Math.random();   // 返回[0,1)之间的数
        int num = (int) (6 * Math.random()) + 1; // 0-6
        System.out.println(d);
        System.out.println(num);
        if (num < 4) {
            System.out.println("小");
        } else {
            System.out.println("大");
        }
        // 成绩等级判定
        int score = (int)(d * 100);
        System.out.println("得分："+score);
        if (score<60){
            System.out.println("成绩为D");
        } else if (score<70) {
            System.out.println("成绩为C");
        } else if (score<80) {
            System.out.println("成绩为B");
        } else {
            System.out.println("成绩为A");
        }

    }
}
