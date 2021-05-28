package ThreadDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author:Administrator
 * @date:2021/4/7 0007 20:42
 */
public class ThreadWork {
    public static void main(String[] args) throws IOException {
        LinkedList<String> buffer = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容");
        PrintWriter pw = new PrintWriter(new FileWriter("work.txt"));
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                //不断的检索缓冲区里面是否有内容
                while (true) {
                    if (buffer.isEmpty()) {
                        System.out.println("缓冲区为空");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    String data = buffer.removeFirst();
                    pw.println(data);
                    System.out.println("数据写入中。。。。。。");
                    pw.flush(); // 刷新流

                }
            }
        });
        // 定义一个读取线程
        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String data = sc.nextLine();
                    if ("exit".equalsIgnoreCase(data)) {
                        break;
                    }
                    buffer.addLast(data);
                }
            }
        });
        writer.setDaemon(true);
        writer.start();
        reader.start();
    }
}
