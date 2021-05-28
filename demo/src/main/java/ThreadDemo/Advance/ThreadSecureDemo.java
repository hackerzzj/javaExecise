package ThreadDemo.Advance;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:Administrator
 * @date:2021/4/8 0008 17:00
 */
public class ThreadSecureDemo {
    public static void main(String[] args) {
        test();
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        System.out.println("里面代码是锁定的");
        lock.unlock();
    }

    private synchronized static void test() {
        System.out.println("调用test方法");
    }

}
