package CollectionsDemo;

import java.util.HashSet;

/**
 * @author:zzj
 * @date:2021/3/24 0024 9:22
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(100);
        set.add("1234");
        set.add(true);
        set.add('x');
        System.out.println(set.size());
        System.out.println(set);
        HashSet<Foo> set1 = new HashSet<Foo>();
        set1.add(new Foo(1));
        set1.add(new Foo(1));
        set1.add(new Foo(2));
        set1.add(new Foo(3));
        System.out.println(set1);
    }
}
class Foo{
    int a;
    public Foo(int a){
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Foo foo = (Foo) o;

        return a == foo.a;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "a=" + a +
                '}';
    }

    @Override
    public int hashCode() {
        return a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
