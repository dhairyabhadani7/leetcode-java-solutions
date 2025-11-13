package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class Sol6{
    public static void countFrequency(int[] nums){
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else hm.put(nums[i],1);
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }
}

public class CountFrequency {
    public static void main(String[] args) {

        int[] arr= {1,2,3,1,2,1,4,5,5,3,6,7,8,2,2};
        Sol6.countFrequency(arr);

    }
}
