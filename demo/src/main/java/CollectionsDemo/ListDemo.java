package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2021/3/20 0020 11:29
 * list接口的基本操作
 * 1、有序重复带索引
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("中国");
        list.add("美国");
        list.add("俄罗斯");
        // 你想要的放入位置的坐标
        list.add(1,"德国");
        list.add("德国");
        list.add(null);
        System.out.println(list);
        // get 方法
        System.out.println(list.get(1));
        // indexOf
        System.out.println(list.indexOf("德国"));
        System.out.println(list.subList(1,4));
        // set
        list.set(list.indexOf("美国"),"澳大利亚" );
        System.out.println(list);
        list.remove("德国"); // 只会删除第一符合条件的元素
        System.out.println(list);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.remove(1); // 会默认为索引，而不是元素
        System.out.println(list1);
    }
}
