package ThreadDemo.Advance.producerConsumerProblem;

/**
 * @author:Administrator
 * @date:2021/4/9 0009 15:36
 * 1.仓库作为属性以及对应的构造方法
 * 2、本身是一个线程对象，里面的run方法是一个循环，不断的生产数据放入到集合容器中的过程。进行容器的判断
 */
public class Productor extends Thread {
    // 仓库对象属性
    Storage storage;

    // 对应的构造方法
    Productor(Storage storage) {
        super();
        this.storage = storage;
    }

    //生产商品的逻辑
    @Override
    public void run() {
        // 只能生产商品
        synchronized (storage) {
            while (true) {
                if (storage.list.size() >= storage.MAX_SIZE) {
                    System.out.println("仓库已满(" + Thread.currentThread().getName() + "),暂时不能执行生产任务");
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
                    storage.list.add(new Object());
                    System.out.println(Thread.currentThread().getName() + "生产了一个商品，仓库容量为" + storage.list.size());
                    storage.notifyAll();
                }
            }
        }
    }
}
