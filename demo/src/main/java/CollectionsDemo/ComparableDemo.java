package CollectionsDemo;

import java.util.*;

/**
 * @author:zzj
 * @date:2021/3/24 0024 17:52
 * Comparable运用
 * 实现Comparable接口并且重写了ComparaTo方法时，那就证明了该类具有一个排序规则
 * 2、这个排序规则可以运用一下几个场合
 *  a、TreeSet
 *  b、Arrays.sort
 *  c、Collections.sort
 */
public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> set2 = new TreeSet<>();
        set2.add(new Student(12,"sum"));
        set2.add(new Student(13,"jack"));
        set2.add(new Student(14,"chen"));
        set2.add(new Student(15,"liu"));
        System.out.println(set2);
        Student[] stus = new Student[3];
        stus[0]=new Student(12,"sum");
        stus[1]=new Student(13,"fei");
        stus[2]=new Student(14,"liu");
        System.out.println(Arrays.toString(stus));
        Arrays.sort(stus);
        System.out.println(Arrays.toString(stus));
        ArrayList<Student> cols = new ArrayList<Student>();
        cols.add(new Student(21,"sum"));
        cols.add(new Student(33,"fei"));
        cols.add(new Student(23,"liu"));
        cols.add(new Student(34,"wang"));
        System.out.println(cols);
        Collections.sort(cols);
        System.out.println(cols);
    }
}
