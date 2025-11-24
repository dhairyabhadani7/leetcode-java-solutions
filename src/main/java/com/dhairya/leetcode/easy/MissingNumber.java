package com.dhairya.leetcode.easy;

class MissNum{
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<n;i++){
            actualSum+=nums[i];
        }
        return expectedSum-actualSum;

    }
}

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {9,3,5,7,2,4,6,0,1};
        MissNum num = new MissNum();
        System.out.println(num.missingNumber(arr));

    }
}
