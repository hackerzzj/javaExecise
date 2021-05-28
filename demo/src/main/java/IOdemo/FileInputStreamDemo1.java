package IOdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * @author:Administrator
 * @date:2021/3/28 0028 16:48
 * char数组读取文件,一个字节数组的操作
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args)  {
        FileInputStream is = null;
        try {
            is = new FileInputStream("text1.txt");
            // 构建一个字节素组作为缓冲区
            byte[] buff = new byte[is.available()]; // 适用于小文件 根据实际情况
            is.read(buff);
            // 把缓冲区内容拿出来
            String s = new String(buff);
            System.out.println(s);
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
