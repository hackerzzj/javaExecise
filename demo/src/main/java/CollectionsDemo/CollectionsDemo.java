package CollectionsDemo;

import org.springframework.boot.context.event.EventPublishingRunListener;
import org.w3c.dom.ls.LSInput;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * @author:Administrator
 * @date:2021/3/19 0019 21:06
 * Collection为抽象类，无法实例化，使用子接口进行接口的对象引用
 *   泛型就是对容器能够放置的元素进行约束
 *   如果不使用泛型的话，那么集合构造及使用的时候都会报警告
 * 3.集合中的API操作
 *  交并差
 *  addAll
 *  retainAll
 *  removeAll
 *
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        testCollections();
    }
     static void testCollection(){
         Collection col1 = new ArrayList();
         // collection中可以存放任意类型
         col1.add(111);
         col1.add(3.12);
         col1.add(true);
         col1.add("sdfffs");
         Collection<Integer> col2 = new ArrayList<Integer>();
         col2.add(100);
         // 进行数学里面的交并差
         Collection<Integer> col3 = new ArrayList<Integer>();
         Collection<Integer> col4 = new ArrayList<Integer>();
         col3.add(1);
         col3.add(2);
         col3.add(3);
         col3.add(4);
         col3.add(5);
         col4.add(1);
         col4.add(2);
         col4.add(6);
         col4.add(7);
         col4.add(8);
         // 并操作
//        col3.addAll(col4); // 不会去重
//        col3.retainAll(col4); // 找到相同元素
//        col3.removeAll(col4); // 去除交集
         System.out.println(col3);
         // 如果是引用数据类型
         Collection<student> col5 = new ArrayList<student>();
         Collection<student> col6 = new ArrayList<student>();
         col5.add(new student("1"));
         col5.add(new student("2"));
         col5.add(new student("3"));
         col5.add(new student("4"));
         col5.add(new student("5"));
         col6.add(new student("1"));
         col6.add(new student("2"));
         col6.add(new student("6"));
         col6.add(new student("7"));
         col6.add(new student("8"));
//        col5.addAll(col6);
//        col5.retainAll(col6);

         System.out.println(col5.contains(new student("3")));
         Collection<Integer> col7 = new ArrayList<Integer>();
         col7.add(1);
         col7.add(2);
         col7.add(3);
         col7.add(4);
         col7.add(5);
         System.out.println(col7);
         col7.clear();
         System.out.println(col7);
         System.out.println(col7.isEmpty());
         System.out.println(col7.size());
         col7.add(3);
         System.out.println(col7.remove(3));
     }
     static void testCollections(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
         System.out.println(list);
         Collections.sort(list, new Comparator<Integer>() {
             @Override
             public int compare(Integer o1, Integer o2) {
                 return 01-02;
             }
         });
         System.out.println(list);
         // 不存在不一定返回-1
         System.out.println(Collections.binarySearch(list, 2));
         ArrayList<Integer> list1 = new ArrayList<>();
         Collections.addAll(list1,1,2,3,4,5,12,342,423);
         // disjoint 不存在交集  返回booblean类型
         System.out.println(Collections.disjoint(list1,list));
         // 装换成不可变列表
         List<Integer> unmodifiableList = Collections.unmodifiableList(list);
         System.out.println(unmodifiableList);
//         unmodifiableList.add(2); // 会报错
//         Collections.fill(list,1);
         System.out.println(list);
         System.out.println(Collections.frequency(list,1));
         Collections.shuffle(list);
         System.out.println(list);
     }
}
class student{
    String name;

    public student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
