package com.dhairya.leetcode.medium;

import java.util.Arrays;

class Rotate{
    private void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public int[] leftRotateByK(int[] nums, int k){
        if(nums.length==0) return nums;
        k=k%nums.length;
        if(k==0) return nums;

        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        return nums;
    }

    public int[] rightRotateByK(int[] nums, int k){
        if(nums.length==0) return nums;
        k=k%nums.length;
        if(k==0) return nums;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;
    }
}

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Rotate rotate = new Rotate();
        int[] res = rotate.rightRotateByK(arr,3);
        System.out.println(Arrays.toString(res));

    }
}
