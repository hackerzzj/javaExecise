package ThreadDemo;

/**
 * @author:Administrator
 * @date:2021/4/7 0007 19:54
 */
public class daemonThread {
    public static void main(String[] args) {
        Thread demo = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("守护线程正在执行");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "守护线程");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(50);
                        System.out.println("线程A正在执行" + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "线程A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println("线程B正在执行" + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "线程B");
        demo.setDaemon(true);
        demo.start();
        t1.start();
        System.out.println("demo是守护线程吗" + demo.isDaemon());
        t2.start();
    }
}
