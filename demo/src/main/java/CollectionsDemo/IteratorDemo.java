package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:zzj
 * @date:2021/3/23 0023 15:50
 * Iterator迭代器
 * Iterator带泛型和不带泛型的使用
 * Iterator和其他两种迭代方式在使用上的区别；
 * Iterator迭代器存在其他那些迭代器无法替代的特点。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(true);
        list.add("hehe");
        // 使用迭代器进行迭代
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        ArrayList<String> list1 = new ArrayList();
        list1.add("hehe");
        // 使用迭代器进行迭代
        Iterator<String> it1 = list1.iterator();
        while (it1.hasNext()){
            String obj = it1.next();
            it1.remove();
            System.out.println(obj);
        }
//        // 不会报错，但是会发生跳过元素的现象
//        // 因为元素删除后往前进一位，而且i又增加一位，所以会造成错位
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//            if ("hehe".equals(list1.get(i))){
//                list1.remove(i);
//            }
//        }
//        // .ConcurrentModificationException 循环时更改集合会引起错误
//        for (String s: list1 ) {
//            if ("hehe".equals(s)){
//                list1.remove(s);
//            }
//            System.out.println(s);
//        }
    }
}
