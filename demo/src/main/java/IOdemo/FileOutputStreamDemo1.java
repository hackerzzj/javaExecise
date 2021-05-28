package IOdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:Administrator
 * @date:2021/3/28 0028 17:39
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        String name = "Hello World";
        FileOutputStream os = null;
        FileInputStream is = null;
        try {
            is = new FileInputStream("text1.txt");
            os = new FileOutputStream("text2.txt",true);
            byte[] arr = new byte[2];
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
}
