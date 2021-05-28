package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author:Administrator
 * @date:2021/1/26 0026 15:55
 */
@SpringBootTest
public class USBTest {
    @Test
    public void testUsb(){
        LapTop lt = new LapTop();
        lt.run();
        mouse m = new mouse();
        keyBoard k = new keyBoard();
        lt.useUsb(m);
        lt.useUsb(k);
        lt.useUsb(new Usb() {
            @Override
            public void open() {
                System.out.println("111111");
            }

            @Override
            public void close() {
                System.out.println("2222222");
            }
        });
        lt.shutdown();
    }
}
