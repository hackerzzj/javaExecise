package innerclassDemo;

/**
 * @author:Administrator
 * @date:2021/2/28 0028 17:16
 */
public class NullNameInnerClass {
    public static void main(String[] args) {
        F1 f1 = new F1(){
          public void test1(){
              System.out.println("this is nullnameinnerclass test1");
          }
        };
        f1.test1();
        new F2(){
            @Override
            public void test2() {
                super.test2();
            }
        }.test2();
    }
}
class F1{
    public void test1(){
        System.out.println("this is test1");
    }
}
abstract class F2{
    public void test2(){
        System.out.println("this is test1");
    }
}
interface F3{
    public abstract void test3();
}
