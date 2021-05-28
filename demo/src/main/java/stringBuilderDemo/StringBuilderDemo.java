package stringBuilderDemo;

/**
 * @author:Administrator
 * @date:2021/3/8 0008 22:44
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder builder = new StringBuilder(str);
        builder.append("def").append("中国你好").insert(0,"哈哈,").insert(9,",").deleteCharAt(builder.lastIndexOf("国"));
        System.out.println(builder);
    }
}
