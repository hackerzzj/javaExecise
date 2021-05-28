package reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2021/3/26 0026 14:30
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("reflect.Book"); // 第一种
        Book book =(Book) clazz.newInstance();
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
        Class<? extends Book> clazz2 = new Book().getClass(); // 第二种
        Class<?> bookClass = Book.class; // 第三种
    }
}
class Book{
    public int bid;
    private String bname;
    double price;

    public Book(String bname, double price) {
        System.out.println("有参构造函数");
        this.bname = bname;
        this.price = price;
        this.bid = new Random(10000).nextInt(10000);
    }

    public Book() {
        System.out.println("无参构造函数");
        this.bname = "";
        this.price = 0;
        this.bid = new Random(10000).nextInt(10000);
    }
    private void read(){
        System.out.println("读书");
    }
}