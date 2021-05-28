package lession18.functionInterface;

import org.junit.Test;

import java.util.function.Function;

/**
 * @author:Administrator
 * @date:2021/4/14 0014 20:55
 */
public class FunctionDemo {
    @Test
    public void test(){
        Integer i = transform("张学友sss",(str)->str.length());
        System.out.println(i);

        String str = transform("123",Integer::parseInt,integer -> Integer.toString(integer+4));
        System.out.println(str);
    }
    public Integer transform(String name, Function<String,Integer> fun){
        return fun.apply(name);
    }
    public String transform(String name, Function<String,Integer> fun1, Function<Integer,String> fun2){
        return fun1.andThen(fun2).apply(name);
    }
}

