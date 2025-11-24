package com.dhairya.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class CheckDuplicates{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)) return true;

            set.add(num);
        }
        return false;
    }

}

public class ContainsDuplicate {
    public static void main(String[] args) {
       int[] arr={1,1,3,5};
       CheckDuplicates dup = new CheckDuplicates();
       Boolean bool = dup.containsDuplicate(arr);
        System.out.println(bool);

    }
}
