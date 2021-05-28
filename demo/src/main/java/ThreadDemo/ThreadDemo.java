package ThreadDemo;

/**
 * @author:zzj
 * @date:2021/4/4 0004 17:07
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
//        t1.run(); // 不会重开一个新的线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "main线程正在执行" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ":正在执行" + i);
        }
    }
}