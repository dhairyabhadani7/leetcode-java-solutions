package com.dhairya.leetcode.easy;


class Sol4{
    boolean ascending = true;
    boolean descending = true;

    public boolean isSortedArray(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                ascending = false;
            }
            else descending=false;
        }

        return ascending || descending;
    }
}

public class SortedArray {
    public static void main(String[] args) {
        // int [] arr={23,3,76,65,64};
        int[] arr= {23,15,7,3,1};
//         int[] arr={1,2,4,5,9};
//        int[] arr={43,32,22,2,15};
        Sol4 sol= new Sol4();
        boolean res=sol.isSortedArray(arr);
        System.out.println(res);
    }
}
