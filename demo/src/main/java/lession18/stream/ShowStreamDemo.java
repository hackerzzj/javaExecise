package lession18.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:Administrator
 * @date:2021/4/14 0014 21:19
 */
public class ShowStreamDemo {
    // 构建集合对象
        ArrayList<String> list = new ArrayList<>();
    {
        Collections.addAll(list,"张学友","王祖贤","刘德华","张三疯","张杰");
    }
    @Test
    public void testColletion(){
        ArrayList<String> zhanglist = new ArrayList<String>();
        for (String name : list) {
            if (name.contains("张")){
                zhanglist.add(name);
            }
        }
        ArrayList<String> zhanglistResult = new ArrayList<String>();
        for (String name : zhanglist) {
            if (name.length()==3){
                zhanglistResult.add(name);
            }
        }
        System.out.println(zhanglistResult);
    }
    @Test
    public void testStream(){
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
