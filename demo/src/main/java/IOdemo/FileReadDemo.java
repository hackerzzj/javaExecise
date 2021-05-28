package IOdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author:zzj
 * @date:2021/3/28 0028 19:57
 */
public class FileReadDemo {
    public static void main(String[] args) {
        File f = new File("text2.txt");
        BufferedReader bread = null;
        try {
            bread = new BufferedReader(new FileReader(f));
            String content = null;
            while ((content = bread.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bread != null) bread.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
