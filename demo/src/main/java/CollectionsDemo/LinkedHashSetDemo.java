package CollectionsDemo;

import java.util.LinkedHashSet;

/**
 * @author:zzj
 * @date:2021/3/24 0024 10:50
 * 与HashSet相比，LinkedHashSet有序
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);
    }
}
