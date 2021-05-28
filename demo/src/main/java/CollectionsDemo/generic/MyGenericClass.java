package CollectionsDemo.generic;

/**
 * @author:zzj
 * @date:2021/3/23 0023 18:05
 */
public class MyGenericClass<E> {
    private E e;

    public MyGenericClass(E e) {
        this.e = e;
    }

    public MyGenericClass() {
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
