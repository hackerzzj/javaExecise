package regDemo;

/**
 * @author:Administrator
 * @date:2021/3/15 0015 9:54
 */
public class RegDemo {
    public static void main(String[] args) {
//        testCharacter();
        testNumber();
    }
    public static void testCharacter(){
        String s1 = "abc";
        String reg = "[abc]{3}";
        System.out.println(s1.matches(reg));
        String reg2 = "."; // . 代表所有字符
        System.out.println(s1.matches(".{3}"));
        String s2 = ".";
        String reg3 = "[.]"; // 匹配字符.
        System.out.println(s2.matches(reg3));
        String reg4 = "\\d";
        System.out.println("b".matches(reg4));
        System.out.println("1".matches(reg4));
    }
    // 测试数量词
    public static void testNumber(){
        String s1 = "_abdfkf";
        String reg1 = "\\w+";
        System.out.println(s1.matches(reg1));
    }
}
