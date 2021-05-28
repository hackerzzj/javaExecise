package lession18.lambda;

/**
 * @author:Administrator
 * @date:2021/4/11 0011 16:04
 * 1、构建一个静态方法，参数为MyInterface子类,调用参数的方法
 * 2、构建main方法，在main方法中调用该静态方法，用lambda的形式。
 */
public class LambdaTest {
    public static void main(String[] args) {

    }

}
interface MyInterface{
    // 抽象方法
    public  abstract void test();
    // 默认方法 1.8
    default void show3(){

    }
    // 静态 1.8
    static void show4(){

    }
    // 1.9
//    private void show5(){
//
//    }
}