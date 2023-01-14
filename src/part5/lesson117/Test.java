package part5.lesson117;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/***
 * @title 时间类
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 9:54
 **/
public class Test {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("当前时间：" + date1);   // 当前时间：Sat Jan 14 10:00:01 CST 2023
        // 比较时间先后
        Date date2 = new Date();
        System.out.println(date2.getTime());
        System.out.println(date2.after(date1)); // 判断日期date2是否在date1之后  true
        // 把时间对象按照指定格式转成相应的字符串
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = dataFormat.format(new Date());
        System.out.println(str);    // 2023-01-14 10:04:48
        // 把字符串按照指定格式转成相应的时间对象
        try {
            Date date = dataFormat.parse("2022-11-23 10:32:03");
            System.out.println(date);   // Wed Nov 23 10:32:03 CST 2022
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // 查看今天是今年的第几天
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
        String str2 = simpleDateFormat.format(new Date());
        System.out.println(str2);   // 14
        // 日历类
        Calendar calendar = new GregorianCalendar(2024, Calendar.NOVEMBER, 24, 22, 10, 50);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));    // 获取日历的年份
        System.out.println(calendar.get(Calendar.MONTH));   // 获取日历的月份  注：0是1月、11是12月
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 获取日历的日期是星期几
        // 设置日期的相关元素
        calendar.set(Calendar.YEAR, 2020);  // 设置年份
        System.out.println(calendar.get(Calendar.YEAR));
        // 日期的计算
        Calendar calendar1 = new GregorianCalendar();
        calendar1.add(Calendar.DATE, 100);  // 日期加100天
        System.out.println(dataFormat.format(calendar1.getTime()));
        // 日期对象和时间对象转化
        Date date = calendar1.getTime();    // 获取日期
        Calendar calendar2 = new GregorianCalendar();
        calendar2.setTime(date);    // 设置日期
    }
}
