package lession18.functionInterface;

import org.junit.Test;

import java.util.function.Predicate;

/**
 * @author:Administrator
 * @date:2021/4/13 0013 21:43
 * 用来演示Predicate接口
 */
public class PredicateDemo {
    // 测试
    @Test
    public void test(){
        boolean flag = checkString("hello",s->s.length()>7);
        System.out.println(flag);


        boolean flag2 = checkString("hello",s->s.length()>7,s->s.contains("llo"));
        System.out.println(flag2);
    }
    public boolean checkString(String name, Predicate<String> pre){
        return pre.negate().test(name);
    }
    public boolean checkString(String name, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.and(pre2).test(name);
//        return pre1.or(pre2).test(name);
    }
}
