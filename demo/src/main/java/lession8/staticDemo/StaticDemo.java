package lession8.staticDemo;

/**
 * @author:Administrator
 * @date:2021/2/25 0025 17:05
 * for learn static
 * 修饰
 * 成员变量
 * 成员方法
 * 代码块
 * 内部类
 */
public class StaticDemo {
    public static void main(String[] args) {
        // 测试访问资源
        Static s1 = new Static();
        s1.a = 10;
        s1.b = 100;
        System.out.println(s1.a+""+s1.b);
    }


}
class Static{
    int a;
    static int b; //字体变为斜体
    public void test1(){
        System.out.println("普通方法");
    }
    public static void test2(){
        System.out.println("static方法");
    }
}
