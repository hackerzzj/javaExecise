package innerclassDemo;

/**
 * @author:Administrator
 * @date:2021/2/27 0027 20:41
 */
public class InnerClassDemo {
    public InnerClassDemo(){
        System.out.println("外部类构造函数");
    }
    public static void test(){
        System.out.println("外部类静态方法");
    }
    public void test1(){
        System.out.println("外部类成员方法");
    }
    public class B {
        public B(){
            System.out.println("内部类构造函数");
        }
        int x = a;
        {
            System.out.println("x="+x);
        }
        public void test2(){
            test();
            test1();
        }
    }
    int a = 10;
}
