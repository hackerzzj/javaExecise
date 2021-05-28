package IOdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:zzj
 * @date:2021/3/28 0028 17:26
 */
public class FileOutputStreamDemo {
    public static void main(String[] args)  {
        String name = "Hello World";
        FileOutputStream os = null;
        try {
             os = new FileOutputStream("text2.txt",true);
             os.write(name.getBytes());
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
        }

    }
}
