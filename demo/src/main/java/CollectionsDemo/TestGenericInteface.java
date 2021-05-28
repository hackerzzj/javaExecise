package CollectionsDemo;

import CollectionsDemo.generic.MyImpl1;
import CollectionsDemo.generic.MyImpl2;

/**
 * @author:Administrator
 * @date:2021/3/23 0023 21:46
 */
public class TestGenericInteface {
    public static void main(String[] args) {
        MyImpl1<Integer> my1 = new MyImpl1<>();
        my1.add(123);
        System.out.println(my1.getE());
        MyImpl2<Integer> my2 = new MyImpl2<>();
        my2.add("1231231");
        System.out.println(my2.getE());
    }
}
