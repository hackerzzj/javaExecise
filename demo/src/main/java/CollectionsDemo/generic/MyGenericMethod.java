package CollectionsDemo.generic;

import innerclassDemo.StaticInnerClass;

/**
 * @author:zzj
 * @date:2021/3/23 0023 21:56
 * 在某个方法上使用泛型的时候
 */
public class MyGenericMethod {
    // 在修饰词位置上写一个泛型的尖括号，里面随便写个类型。
    // 这样的效果等同于在类或者接口后面加<>,只不过这样的范围只局限于当前的方法
    public <E> void test(E e){
        System.out.println(e.getClass());
    }
    public <E> E getE(E e){
        return e;
    }

    public static void main(String[] args) {
        MyGenericMethod mt = new MyGenericMethod();
        mt.test("sdfsf");
    }
}
