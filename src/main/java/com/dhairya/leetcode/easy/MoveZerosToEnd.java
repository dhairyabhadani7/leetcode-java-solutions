package com.dhairya.leetcode.easy;

import java.util.Arrays;

class Sol15{
    public static int[] moveZeros(int[] nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        return nums;
    }
}
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr= {1,0,4,6,0,8,0};
        int[] res=Sol15.moveZeros(arr);
        System.out.println(Arrays.toString(res));

    }
}
