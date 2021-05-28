package ioFileDemo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author:zzj
 * @date:2021/3/27 0027 20:54
 * 删除一个包含未知数量文件的文件夹
 */
public class DeleteDirDemo {
    public static void main(String[] args) throws IOException {
        findFileOrDirect("api-ms-win-core","D:\\123456");
    }
    public static void deleteFileOrDir(String name){
        File file = new File(name);
        deleteDir(file,file.getPath());
    }
    public static void deleteDir(File file,String dirname){
        if (file.exists()){
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    deleteDir(f, dirname);
                }
            }
            file.delete();
        }
        if(dirname.equals(file.getPath())){
            System.out.println("删除完毕");
        }
    }
    public static void findFileOrDirect(String name,String path) throws IOException {
        File file = new File(path);
        LinkedList<String> paths = new LinkedList<>();
        if (file.exists()){
            if (!file.isDirectory()){
                if (name.equals(file.getName())|| file.getName().contains(name)){
                    paths.add(file.getCanonicalPath());
                }
                System.out.println("搜索完毕");
            }else{
                findFile(name,file,paths);
                System.out.println("搜索完毕");
            }
        }else{
            System.out.println("路径不存在");
        }
        Iterator<String> iterator = paths.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    private static void findFile(String name, File file, LinkedList<String> paths) throws IOException {
        if (file.exists()){
            if (name.equals(file.getName())|| file.getName().contains(name)){
                paths.add(file.getCanonicalPath());
            }
            if (file.isDirectory()){
                File[] files = file.listFiles();
                for (File f : files) {
                    findFile(name,f,paths);
                }
            }
        }
    }


}
