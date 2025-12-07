package com.dhairya.leetcode.easy;

import java.util.Arrays;

class RunSum{
    public int[] runnningSum(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}

public class RunningSum1D {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        RunSum runSum=new RunSum();
        int[] res=runSum.runnningSum(arr);
        System.out.println(Arrays.toString(res));
    }
}
