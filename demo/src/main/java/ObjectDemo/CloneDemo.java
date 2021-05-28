package ObjectDemo;

/**
 * @author:Administrator
 * @date:2021/3/1 0001 21:01
 * Object中clone方法的使用
 * 1。使用clone来完成对象的浅层复制
 * 2.一个类要实现复制功能要先实现CloneAble接口
 * 3.调用该clone方法
 * 4.返回的是object对象，需要进行强转
 */
public abstract class CloneDemo  {
    public static void main(String[] args) {
        mm m1 = new mm();
        try {
            mm m2 = (mm)m1.clone();
            System.out.println(m2.toString());
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }

}
class mm implements Cloneable {
    int a ;
    String b;
    public mm() {
        System.out.println("mm none Generator");
    }

    public mm(int a, String b) {
        System.out.println("mm two Generator");
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "mm{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}