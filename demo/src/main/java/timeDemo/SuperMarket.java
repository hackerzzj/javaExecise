package timeDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author:Administrator
 * @date:2021/3/18 0018 16:03
 * 通过Scanner来录入一个商品的生产日期和保质期；
 * 需要算出这个商品的过期时间
 * 需要设置一个促销时间
 * 在过期的前三周的周五
 */
public class SuperMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的生产日期");
        String date = sc.next();
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int mouth = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        Calendar cal = new GregorianCalendar(year,mouth,day);
        System.out.println("请输入商品的保质期");
        int bzq = sc.nextInt();
        cal.add(Calendar.MONTH,bzq);
        cal.add(Calendar.WEEK_OF_YEAR,-3);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SATURDAY){
            cal.add(Calendar.WEEK_OF_YEAR,1);
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
        } else {
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
        }
    }
}
