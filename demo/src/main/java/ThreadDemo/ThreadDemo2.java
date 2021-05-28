package ThreadDemo;

/**
 * @author:zzj
 * @date:2021/4/4 0004 17:07
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        new Thread() { // 匿名内部类
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(this.getName() + ":正在执行" + i);
                }
            }
        }.start();
//        t1.run(); // 不会重开一个新的线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "main线程正在执行" + i);
        }
    }
}

