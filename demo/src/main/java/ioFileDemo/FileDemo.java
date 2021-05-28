package ioFileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author:zzj
 * @date:2021/3/26 0026 22:07
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/t1.txt");
        File file1 = new File("d:t2.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }
    }
}
