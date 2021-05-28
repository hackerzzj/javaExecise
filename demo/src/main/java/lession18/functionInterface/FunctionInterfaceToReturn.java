package lession18.functionInterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author:Administrator
 * @date:2021/4/12 0012 17:26
 * 函数式接口作为返回值 comparator
 */
public class FunctionInterfaceToReturn {
    @Test
    public void test(){
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"12223","1234","1ss","123132123");
        list.sort(getMyComparator());
        System.out.println(list);
    }
    // 函数式接口
    public Comparator<String> getMyComparator(){
        // 字符串长度的升序排序
        return (s1,s2)->{
            return s1.length()-s2.length();
        };
    }
}
