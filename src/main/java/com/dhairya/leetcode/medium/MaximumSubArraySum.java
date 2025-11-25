package com.dhairya.leetcode.medium;

class MaxSubArrSum{
    public int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currentSum=Math.max(nums[i],(currentSum+nums[i]));
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}

public class MaximumSubArraySum {
    public static void main(String[] args) {
    int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
    MaxSubArrSum ms= new MaxSubArrSum();
    int res= ms.maxSubArray(arr);
        System.out.println(res);
    }
}
