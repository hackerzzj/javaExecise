package ThreadDemo.Advance.producerConsumerProblem;

import org.junit.Test;

/**
 * @author:Administrator
 * @date:2021/4/9 0009 16:00
 */
public class TestPorducerConsumerProblem {
    @Test
    public void testPorducerConsumer() {
        Storage storage = new Storage();
        // 多个生产者
        Productor p1 = new Productor(storage);
        Productor p2 = new Productor(storage);
        Productor p3 = new Productor(storage);
        // 多个消费者
        customer c1 = new customer(storage);
        customer c2 = new customer(storage);
        customer c3 = new customer(storage);
        // 启动线程
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        // 多个生产者
        Productor p1 = new Productor(storage);
        Productor p2 = new Productor(storage);
        Productor p3 = new Productor(storage);
        // 多个消费者
        customer c1 = new customer(storage);
        customer c2 = new customer(storage);
        customer c3 = new customer(storage);
        // 启动线程
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
