package IOdemo;

import java.io.*;

/**
 * @author:zzj
 * @date:2021/3/28 0028 17:57
 * 用来对比字节流+缓冲区和字节流+过滤流（缓冲流）的写法区别
 */
public class BufferedStreamDemo {
    public static void main(String[] args) {
        testBufferedArea();
        testBufferedStreamArea();
    }

    private static void testBufferedArea() {
        String name = "Hello World";
        FileOutputStream os = null;
        FileInputStream is = null;
        try {
            is = new FileInputStream("text1.txt");
            os = new FileOutputStream("text2.txt",true);
            byte[] arr = new byte[2];
            // index代表游标的位置
            int index ;
            while ((index = is.read(arr)) != -1){
                os.write(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void testBufferedStreamArea() {
        String name = "Hello World";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        FileOutputStream os = null;
        FileInputStream is = null;
        try {
           bis = new BufferedInputStream(new FileInputStream("text1.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("text2.txt",true));
            byte[] arr = new byte[2];
            // data代表的是数据的字节
            int data ;
            while ((data = bis.read()) != -1){
                os.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
