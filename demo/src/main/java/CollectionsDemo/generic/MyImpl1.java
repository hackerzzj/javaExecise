package CollectionsDemo.generic;

/**
 * @author:zzj
 * @date:2021/3/23 0023 21:36
 * 模拟ArrayList实现List接口的写法，此时泛型里面的内容仍然没有确定
 * 等到构造该对象的时候进行确定
 */
public class MyImpl1<E> implements MyGenericInterface<E> {
    private E e ;
    @Override
    public void add(E e) {
        this.e = e;
    }

    @Override
    public E getE() {
        return e ;
    }
}
