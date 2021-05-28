package lession18.functionInterface;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * @author:Administrator
 * @date:2021/4/12 0012 21:38
 * 改接口提供一个与泛型相同的数值
 */
public class SupplierExercise {
    //2、测试
    @Test
    public void test(){
        int[] arr = {19,20,5,22,30};
        int maxNum = getMaxNum(()->{
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println("最大值"+maxNum);
    }
    //1、构建一个方法，方法里面是supplier类型的对象
    public int getMaxNum(Supplier<Integer> sup){
        return sup.get();
    }
}
