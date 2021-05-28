package timeDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author:Administrator
 * @date:2021/3/18 0018 17:54
 *1、解析 parse
 * 2、格式化 format
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        String s1 = "2020-02-09 19:23:45";
        // 时间推前三个月，然后把星期改为周一
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(s1);
        // 转成Calendar进行计算
        Calendar cl = new GregorianCalendar();
        cl.setTime(parse);
        cl.set(Calendar.MONTH,-3);
        cl.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        Date date = cl.getTime();
        System.out.println(date);


        SimpleDateFormat sdf1 = new SimpleDateFormat("yy/M/d H:m a");
        String format = sdf1.format(date);
    }
}
