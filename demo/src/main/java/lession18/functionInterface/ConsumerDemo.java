package lession18.functionInterface;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author:Administrator
 * @date:2021/4/12 0012 21:58
 */
public class ConsumerDemo {
    @Test
    public void  test(){
        operatorString("张学友",(str)->{
            System.out.println(str.charAt(0));
            System.out.println(new StringBuilder(str).reverse());
        });
        operatorString("刘德华",(str)->{
            System.out.println(str.substring(0,2));
        },(str)->{
            System.out.println(new StringBuilder(str).reverse());
        });
    }
    // 再次定义该方法，用来测试该接口里面的andThen这个方法，所以我们需要2个消费者对象
    public void operatorString(String name,Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }
    public void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
