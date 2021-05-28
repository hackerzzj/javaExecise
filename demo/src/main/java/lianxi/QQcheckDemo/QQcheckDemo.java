package lianxi.QQcheckDemo;

import java.util.Scanner;

/**
 * @author:Administrator
 * @date:2021/3/9 0009 21:05
 */
public class QQcheckDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QQ号码");
        String qq = sc.next();
//        Boolean flag = qqcheck(qq);
        Boolean flag = qqcheck1(qq);
        if(flag){

            System.out.println("qq号码合格");
        } else{
            System.out.println("qq号码不合格");
        }
        sc.close(); // 关闭
    }
    // 使用正则表达式
    private static Boolean qqcheck1(String qq) {
        // 定义正则表达式
        String reg = "[1-9][0-9]{4,11}";

        return qq.matches(reg);
    }

    static Boolean  qqcheck(String qq){
        if(qq.startsWith("0")){
            return false;
        }else if(qq.length()<5 || qq.length() >12){
            return false;
        }
        // 校验只能是数字
//        // 第一种方式
//        char[] arr = qq.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<'0'|| arr[i]>'9'){
//                return false;
//            }
//        }
        // 第二种方式
        try {
            Long.parseLong(qq);
        } catch (Exception e){
            return false;
        }

        return true;
    }
}
