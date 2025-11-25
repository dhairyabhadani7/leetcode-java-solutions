package com.dhairya.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ArrIntersect{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set= new HashSet<>();
        Set<Integer> result=new HashSet<>();
        for(int num: nums1){
            set.add(num);
        }
        for(int num: nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        int[] arr = new int[result.size()];
        int i = 0;

        for (Integer num : result) {
            arr[i++] = num;
        }
        return arr;
    }
}

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        ArrIntersect inter= new ArrIntersect();
        int[] arr=inter.intersection(nums1, nums2);
        System.out.println(Arrays.toString(arr));


    }
}
