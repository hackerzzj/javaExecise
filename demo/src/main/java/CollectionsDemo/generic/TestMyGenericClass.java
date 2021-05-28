package CollectionsDemo.generic;

/**
 * @author:zzj
 * @date:2021/3/23 0023 21:14
 */
public class TestMyGenericClass {
    public static void main(String[] args) {
        // 根据构建ArrayList的形式来构建一个MyGenericClass类
        MyGenericClass<String> mg = new MyGenericClass<>("string");
        mg.getE();
    }
}
