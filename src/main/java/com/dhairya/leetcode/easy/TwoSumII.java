package com.dhairya.leetcode.easy;

import java.util.Arrays;

class TwoSumProblem {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

            while (left < right) {
                int sum=numbers[left]+numbers[right];
                if (sum == target)
                    return new int[]{left+1, right+1};
                else if(sum<target) left++;
                else right--;
            }

        return new int[]{-1, -1};
    }
}

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr= {2,7,11,13};
        int target=9;
        TwoSumProblem problem = new TwoSumProblem();
        int[] res= problem.twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
