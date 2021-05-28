package CollectionsDemo;

import java.security.PublicKey;
import java.util.*;

/**
 * @author:zzj
 * @date:2021/3/24 0024 21:36
 * Comparator比较器的使用
 * 临时比较
 * 重载方法为compare方法，与Comparable接口中compareTo方法类型（前者两个参数，后者一个参数）
 *
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Teacher[] stus = new Teacher[3];
        stus[0]=new Teacher(12,"sum");
        stus[1]=new Teacher(13,"fei");
        stus[2]=new Teacher(14,"liu");
        System.out.println(Arrays.toString(stus));
        Arrays.sort(stus,new MySort());
        System.out.println(Arrays.toString(stus));
        ArrayList<Teacher> cols = new ArrayList<Teacher>();
        cols.add(new Teacher(21,"sum"));
        cols.add(new Teacher(33,"fei"));
        cols.add(new Teacher(23,"liu"));
        cols.add(new Teacher(34,"wang"));
        System.out.println(cols);
        Collections.sort(cols, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o2.age - o1.age;
            }
        });
        System.out.println(cols);
    }
}
class MySort implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o2.age - o1.age;
    }
}
class Teacher  {
    int age;
    String name;
    public Teacher(){}
    public Teacher(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return name+"Teacher"+",age is"+age;
    }

}