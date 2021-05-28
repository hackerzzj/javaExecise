package lession18.functionInterface;
/**
 * @author:Administrator
 * @date:2021/4/12 0012 17:14
 * 该类用来演示函数式接口作为参数存在的案例：Runable对象
 */
public class FunctionInterfaceToParam {
    // 2、测试
    public static void main(String[] args) {
        startTread(()->
            System.out.println("lambda表达式的启动")
        );
    }
    // 1、构建一个使用Runnable对象作为参数的方法
    public static void startTread(Runnable r){
        new Thread(r).start();
    }
}
