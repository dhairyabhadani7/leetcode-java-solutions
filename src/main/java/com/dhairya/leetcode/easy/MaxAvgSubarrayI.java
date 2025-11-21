package com.dhairya.leetcode.easy;

class MaxSub{
    public double findMaxAverage(int[] nums, int k) {
      if(nums.length==1) return nums[0];
      double currentSum=0;
     for(int i=0;i<k;i++) {
         currentSum += nums[i];
     }
        double maxSum=currentSum;

     for(int i=k;i<nums.length;i++){
            currentSum+=nums[i];
            currentSum-=nums[i-k];
            maxSum=Math.max(maxSum,currentSum);
        }
         return maxSum/k;
    }
}

public class MaxAvgSubarrayI {
    public static void main(String[] args) {
     int[] nums={1,12,-5,-6,50,3};
     int k = 4;
     MaxSub mas= new MaxSub();
     double res=mas.findMaxAverage(nums,k);
        System.out.println(res);
    }
}
