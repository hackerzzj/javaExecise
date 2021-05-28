package com.example.demo;

import innerclassDemo.StaticInnerClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private Person person;
    Student stu = new fuzjiazii();

    @Test
    public void contextLoads() {
        HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
        this.findShortestSubArray(new int[]{});
    }
    public void findShortestSubArray(int[] nums){
//        HashMap<Integer, int[]> map = new HashMap<>();
//        for (int i = 0; i<nums.length;i++){
//            if(map.containsKey(nums[i])){
//                map.get(nums[i])[0]++;
//                map.get(nums[i])[2] = i;
//            } else{
//                map.put(nums[i],new int[]{1,i,i});
//            }
//        }
//        int maxnum = 0,minlen = 0;
//        for (Map.Entry<Integer,int[]> entry:map.entrySet()){
//            int[] arr = entry.getValue();
//            if (maxnum < arr[0]){
//                maxnum = arr[0];
//                minlen = arr[2]-arr[1]+1;
//            }else if(maxnum == arr[0]){
//                int len = arr[2]-arr[1]+1;
//                if (minlen>len){
//                    minlen = len;
//                }
//            }
//        }
//        return minlen;
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println(StaticInnerClass.inner.x3);
        new StaticInnerClass.inner();
    }
}
