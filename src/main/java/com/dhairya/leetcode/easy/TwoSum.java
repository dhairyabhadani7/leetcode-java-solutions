package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complecent = target-nums[i];
            if(hm.containsKey(complecent)){
                return new int[]{hm.get(complecent),i};
            }
            hm.put(nums[i],i);

        }
        return new int[]{};

    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target =9;
        int[] res = Solution.twoSum(nums, target);
        System.out.println("Indices: [" + res[0] + ", " + res[1] + "]");
    }
}
