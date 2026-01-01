package com.dhairya.leetcode.easy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Sol{
    public int[] moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length){
            nums[j++]=0;
        }
        return nums;
    }
}

 class Practice{
    public static void main(String[] args) {
        Sol sol = new Sol();
        int[] arr={0,1,0,3,12};
        int[] movedArray=sol.moveZeroes(arr);
        System.out.print("Array after moving zeroes: "+ Arrays.toString(movedArray));
        
    }
}