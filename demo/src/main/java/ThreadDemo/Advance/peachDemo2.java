package ThreadDemo.Advance;

/**
 * @author:Administrator
 * @date:2021/4/9 0009 11:44
 */
public class peachDemo2 {
    public static void main(String[] args) {
        Object peach = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (peach) {
                    System.out.println("张三：老板，我要吃桃子");
                    try {
                        // 等老板喊他吃桃子
                        peach.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 线程被唤醒，接着往后执行
                    System.out.println("张三：谢谢老板的桃子，很好吃");
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                synchronized (peach) {
                    System.out.println("李四：老板，我要吃桃子");
                    try {
                        // 等老板喊他吃桃子
                        peach.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 线程被唤醒，接着往后执行
                    System.out.println("李四：谢谢老板的桃子，很好吃");
                }
            }
        }.start();
        // 创建一个摘桃子的线程
        new Thread(() -> {
            synchronized (peach) {
                // 摘桃子
                try {
                    Thread.sleep(1000);
                    System.out.println("摘桃子");
                    // 唤醒休眠的线程
                    peach.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
