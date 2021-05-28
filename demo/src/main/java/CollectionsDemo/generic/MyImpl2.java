package CollectionsDemo.generic;

/**
 * @author:zzj
 * @date:2021/3/23 0023 21:40
 * 如果实现接口的时候，接口的泛型已经确定，则所需要实现的方法中的泛型也会确定下来
 */
public class MyImpl2<E> implements MyGenericInterface<String> {

    private String s;
    @Override
    public void add(String s) {
        this.s = s;
    }

    @Override
    public String getE() {
        return this.s;
    }
}
