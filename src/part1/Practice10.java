package part1;

/**
 * 条件运算符(三目运算符)
 *
 * @author centuryw
 */
public class Practice10 {
    public static void main(String[] args) {
        int score = 80;
        String grade = score>60?"及格":"不及格";
        System.out.println(grade);
        int x = -100;
        System.out.println(x>0?1:(x==0?0:-1));
    }
}
