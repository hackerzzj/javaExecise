package lession7.question;

import java.util.HashMap;

/**
 * @author:Administrator
 * @date:2021/2/25 0025 15:08
 * 1、选择题
 * 选项 option[]
 * print() 打印题号和题干
 * check(String[] answer) 检查答案是否正确
 */
public class chooseQuestion extends Question {
    String[] options;// 选项
    public void print(){
        System.out.println(id+':'+text);
        for (String option : options){
            System.out.println(option);
        }
    }
    public Boolean check(String[] answer){
        return true;
    }
    public Boolean check(String answer) {
        return true;
    }

    public static void main(String[] args) {
        HashMap m1 = new HashMap();
        m1.put(1,2);
        m1.put(3,4);
        HashMap m2 = new HashMap();
        m2.put(1,2);
        m2.put(3,4);
        System.out.println(m1.equals(m2));
    }
}
