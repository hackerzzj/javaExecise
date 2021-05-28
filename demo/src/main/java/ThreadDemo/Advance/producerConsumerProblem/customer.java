package ThreadDemo.Advance.producerConsumerProblem;

/**
 * @author:Administrator
 * @date:2021/4/9 0009 15:51
 * 1.仓库作为属性以及对应的构造方法
 * 2、本身是一个线程对象，里面的run方法是一个循环，不断的从集合容器中拿出对象的过程。进行容器是否为空的判断
 */
public class customer extends Thread {
    Storage storage;

    customer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            while (true) {
                if (storage.list.isEmpty()) {
                    System.out.println("仓库已空(" + Thread.currentThread().getName() + "),暂时不能执行消费任务");
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    storage.list.remove();
                    System.out.println(Thread.currentThread().getName() + "消费了一个商品，仓库容量为" + storage.list.size());
                    storage.notifyAll();
                }
            }
        }
    }
}
