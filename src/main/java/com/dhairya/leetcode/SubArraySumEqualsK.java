package com.dhairya.leetcode;

import java.util.HashMap;
import java.util.Map;

class SubArray{
    public int subArraySum(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int currSum=0;
        int count=0;
        for(int num: nums){
            currSum+=num;
            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr={1,2,-3,2,-4,2,2};
        SubArray subArray = new SubArray();
        int res=subArray.subArraySum(arr,2);
        System.out.println(res);
    }
}
