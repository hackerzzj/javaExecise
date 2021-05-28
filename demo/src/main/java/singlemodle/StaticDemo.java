package singlemodle;

/**
 * @author:Administrator
 * @date:2021/1/26 0026 16:50
 * 1.成员属性
 * 2.成员方法
 * 3.代码快
 * 4.内部类
 */
public class StaticDemo {
    public static void main(String[] args) {
        Static s1 = new Static();
        test2 t2 = test2.getInstance();
        System.out.println(s1.a+" "+s1.b);
        t2.test1();
        System.out.println(t2.a+" "+t2.b);
        Static s2 = (Static) t2;
        final int s3 ;
        s3 = 123;
        s2.test1(); // 方法有一个，重写了
        s2.test3(); // 方法每个有一个
        System.out.println(s2.a+" "+s2.b);
    }
}
class Static{
    int a = 10;
    static int b = 20; // 静态资源为斜体
    {
        System.out.println("我是代码块");
    }
    public void test1(){
        System.out.println("父类托尔斯泰" +
                "");
    }
    public static void test3(){
        System.out.println("父类静态方法");
    }
}
class test2 extends Static{
    int a =100;
    static int b = 20; // 静态资源为斜体
    int c = 200;
    private static test2 t2 = new test2();
    public static test2 getInstance(){
        return t2;
    }
    private test2(){
        System.out.println("test2进行了初始化");
    }
    public void test1(){
        System.out.println("子类托尔斯泰" +
                "");
    }
    public static void test3(){
        System.out.println("子类静态方法");
    }
}