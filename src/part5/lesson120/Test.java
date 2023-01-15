package part5.lesson120;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/***
 * @title 可视化日历程序
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 10:19
 **/
public class Test {
    public static void main(String[] args) {
        String str = "2023-1-14";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = simpleDateFormat.parse(str);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            int maxMonthDay = calendar.getActualMaximum(Calendar.DATE); // 获取该月最大天数
            System.out.println("本月最大天数：" + maxMonthDay);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK) - 1; i++) {
                System.out.print('\t');
            }
            for (int i = 1; i <= maxMonthDay; i++) {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + "\t");
                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                    System.out.println();   // 如果是周六则换行
                }
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
