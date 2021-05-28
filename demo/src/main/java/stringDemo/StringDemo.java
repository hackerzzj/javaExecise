package stringDemo;

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2021/3/5 0005 10:44
 * 字符串api的操作
 * 1、判断功能
 * 2、获取功能
 * 3、转换功能
 */
public class StringDemo {
    public static void main(String[] args) {
//        panduan();
//        huoqu();
        zhuanhua();
    }
    public static void zhuanhua(){
        String s1 = "abcdefg";
        char[] arr = s1.toCharArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        String s2 = new String(arr); // 完成char数组到字符串的转换
        //getBytes
        byte[] brr = s1.getBytes();
        System.out.println(brr);  // [B@26ba2a48
        System.out.println(Arrays.toString(brr)); // [97, 98, 99, 100, 101, 102, 103]
        // toUppercase
        String s3 = s1.toUpperCase();
        System.out.println(s3); // ABCDEFG
        // toLowercase
        String s4 = s3.toLowerCase();
        System.out.println(s4); // abcdefg
        // replace
        String s5 = s3.replace('A', 'B');
        System.out.println(s5);
        // trim 去除前后的空白
        // 空白 空格、制表符（4格空格）、换行符（\n：一个空格）
        String s6 = " a    b\n";
        System.out.println(s6.length()+"s6"+s6.trim());
        
    }
    public static void panduan(){
        // equals
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        // equalsIgnoreCase
        String s3 = "ABC";
        System.out.println(s1.equalsIgnoreCase(s3));
        // startsWith
        String s4 = "xabcdefab";
        System.out.println(s4.startsWith("abcd"));
        System.out.println(s4.startsWith("ab",1));
        // endsWith
        System.out.println(s4.endsWith("ab"));
        // isEmpty
        String s5 = ""; // String s5 = new String();
        String s6 = " ";
        String s7 = null;
        System.out.println(s5.isEmpty());
        System.out.println(s6.isEmpty());
//        System.out.println(s7.isEmpty()); // 空指针异常
        // contains
        System.out.println(s4.contains("fa"));
    }
    public static void huoqu(){
        // 长度
        String s1 = "abcd";
        System.out.println(s1.length());
        // charAt
        System.out.println(s1.charAt(1));
        // indexOf
        System.out.println(s1.indexOf(3));
        // concat 不改变调用者本身
        System.out.println(s1.concat("xxx"));
        // lastIndexOf
        System.out.println("abcabc".lastIndexOf("b"));
        // substring
        System.out.println("abcdef".substring(1));
        
    }

}
