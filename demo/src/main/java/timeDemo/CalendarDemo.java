package timeDemo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author:Administrator
 * @date:2021/3/18 0018 10:25
 * Calendar 抽象方法 getInstance
 * 通过子类的实例化来获取对象
 * 最常用的方法
 * get 获取指定时间点的值
 * add 对指定的时间点来进行偏移
 * set 用指定的时间点进行设置
 * calendar--->date getTime
 * date--->Calendar setTime
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        System.out.println(time);
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);
        // 指定日期
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar(2020, 1, 1, 0, 0, 0);
        System.out.println(time.get(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.HOUR_OF_DAY));
        // add
        // 张三7天之后结婚
        time.add(Calendar.DAY_OF_MONTH,7);
        System.out.println(time.get(Calendar.DAY_OF_MONTH));
        //set  2021年1月8日
        time.set(2021,0,8);
        System.out.println(time);
        time.set(Calendar.MONTH,0);

        Date date = time.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
        time.setTime(date);
        System.out.println(time);
    }
}
