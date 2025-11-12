package com.dhairya.leetcode.easy;

class Sol3{
    public int secondLargest(int[] nums){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];

            } else if (nums[i]>secondLargest && nums[i]!=largest) {
                secondLargest=nums[i];

            }
        }
        return secondLargest;
    }
}
public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={23,3,76,69,65,64};
        Sol3 sol= new Sol3();
        int res=sol.secondLargest(arr);
        System.out.println(res);
    }
}
