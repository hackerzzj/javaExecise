package IOdemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author:Administrator
 * @date:2021/3/28 0028 17:18
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("text1.txt");
            // 构建一个字节素组作为缓冲区
            byte[] buff = new byte[2]; // 适用于小文件 根据实际情况
            int index;
            while((index = is.read(buff)) != -1){
                System.out.println(new String(buff));
            }
            System.out.println(is.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 通过字节流读取文件
    }
}
