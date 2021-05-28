package ThreadDemo;

/**
 * @author:Administrator
 * @date:2021/4/4 0004 21:59
 * 通过Runable来构建一个多线程
 */
public class RunableDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        new Thread(t1).start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":正在执行" + i);
        }
    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":正在执行" + i);
        }
    }
}
