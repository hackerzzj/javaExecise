package CollectionsDemo;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

/**
 * @author:Administrator
 * @date:2021/3/20 0020 14:56
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // List接口的特点，有序、重复、可以为null
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add(null);
        System.out.println(list);
        // 添加元素
        list.addFirst("kkk");
        System.out.println(list);
        list.addLast("zzz");
        System.out.println(list);
        // 获取首部和尾部的元素
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        // 删除首部和尾部的元素
        System.out.println("进行删除+++++++++++++");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println("进行弹栈操作");
        // 弹栈：栈
        while (!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
