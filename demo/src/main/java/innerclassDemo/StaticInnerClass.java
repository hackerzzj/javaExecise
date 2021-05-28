package innerclassDemo;

/**
 * @author:Administrator
 * @date:2021/2/28 0028 16:36
 * 具备了静态的方法
 * 构造 StaticInnerClass.inner inner = new StaticInnerClass.inner();
 */
public class StaticInnerClass {
    int a1 = 10;
    static int a2 = 20;
    public static void test(){
        System.out.println("外部类静态方法");
    }
    public void test1(){
        System.out.println("外部类成员方法");
    }
    public void test3(){
        System.out.println(inner.x3);
        inner inner = new inner();
        inner.test2();
    }
    public static class inner{
        public inner(){
            System.out.println("inner Generator...");
        }
        int x1 = 1000;
//        int x2 = a1; // 不能访问非静态成员
        int x2 = a2;
        public static int x3 = 2000;
        public void test2(){
            test();
//            test1(); // 静态成员不能访问非静态成员
        }
    }
}
