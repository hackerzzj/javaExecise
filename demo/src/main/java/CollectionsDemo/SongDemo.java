package CollectionsDemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:Administrator
 * @date:2021/3/23 0023 11:30
 */
public class SongDemo {
    public static void main(String[] args) {
        // 初始化
        ArrayList<Song> songs = initSongs();
        // 输出提示语
        // 创建一个scanner对象
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("请输入你要进行的操作：1、查看；2、追加；3、查找；4、删除；5、删除所有；6、退出");
            int order = sc.nextInt();
            switch (order){
                case 1:
                    if (songs.isEmpty()){
                        System.out.println("播放列表为空");
                        break;
                    }
                    System.out.println(songs);
                    break;
                case 2:
                    System.out.println("请输入歌曲名字和歌曲作者");
                    String name = sc.next(); // 以空格作为结束 nextLine() 是读取一行
                    String author = sc.next();
                    Song song = new Song(name, author);
                    if(!songs.contains(song)){
                        songs.add(song);
                        System.out.println("歌曲添加成功");
                    }else{
                        System.out.println("歌曲已经存在");
                    }
                    break;
                case 3:
                    System.out.println("请输入歌曲的作者来寻找歌曲");
                    String songAuthor = sc.next();
                    ArrayList<Song> newList = new ArrayList<Song>();
                    for (Song s:songs){
                        if (s.getSongAuthor().equals(songAuthor)){
                            newList.add(s);
                        }
                    }
                    if (newList.isEmpty()){
                        System.out.println("没有你要找到歌曲");
                    }else{
                        System.out.println(newList);
                    }
                    break;
                case 4:
                    System.out.println("请输入你要删除的歌曲名");
                    String songName = sc.next();
                    ArrayList<Song> delList = new ArrayList<Song>();
                    for (Song s : songs) {
                        if(s.getSongName().equals(songName)){
                            delList.add(s);
                        }
                    }
                    for (Song s:delList){
                        songs.remove(s);
                    }
                    break;
                case 5:
                    System.out.println("删除所有的歌曲");
                    songs.clear();
                    break;
                case 6:
                    songs.clear();
                    flag = false;
                    System.out.println("退出成功");
                    break;

            }
        }
    }
    public static ArrayList initSongs(){
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("忘情水","刘德华"));
        songs.add(new Song("联系","刘德华"));
        songs.add(new Song("忘情水","张学友"));
        return  songs;
    }
}
