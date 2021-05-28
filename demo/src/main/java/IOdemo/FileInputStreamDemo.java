package IOdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author:Administrator
 * @date:2021/3/28 0028 16:48
 * 一个字节一个字节的读取
 */
public class FileInputStreamDemo {
    public static void main(String[] args)  {
        File file = new File("text1.txt");
        FileInputStream  is = null;
        try {
            is = new FileInputStream(file);
            for (long i = 0; i < file.length(); i++) {
                char c =  (char)is.read();
                System.out.println(c);
            }
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
