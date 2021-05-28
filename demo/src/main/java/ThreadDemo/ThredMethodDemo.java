package ThreadDemo;

/**
 * @author:Administrator
 * @date:2021/4/7 0007 14:40
 */
public class ThredMethodDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程" + Thread.currentThread());
                System.out.println("新线程" + Thread.currentThread().getId());
                System.out.println("新线程" + Thread.currentThread().getName());
                System.out.println("新线程" + Thread.currentThread().getPriority());
                System.out.println("新线程" + Thread.currentThread().getState());
                System.out.println("新线程" + Thread.currentThread().getThreadGroup());
                System.out.println("新线程" + Thread.activeCount());
            }
        }, "多线程A").start();
    }
}
