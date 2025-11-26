package com.dhairya.leetcode.easy;

import java.sql.SQLOutput;
import java.util.*;

class Soln{
    public int minElement(int[] nums){
        int min= Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
               min=nums[i];
            }
        }
        return min;
    }
    public int maxElement(int[] nums){
        int max= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public int secondLargest(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        if(nums.length<2) return -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondLargest && nums[i]!=largest){
                secondLargest=nums[i];
            }
        }
        return secondLargest;
    }

    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j++]=0;
        }
        System.out.println(Arrays.toString(nums));

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs= new HashSet<>();
        for(int num: nums){
            if(hs.contains(num)){
               return true;
            }
            hs.add(num);
        }
        return false;
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int complement= target-nums[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i};
            }
            hm.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
                profit=prices[i]-minPrice;
                if(maxProfit<profit){
                    maxProfit=profit;
                }
        }
        return maxProfit;
    }

    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0) candidate=nums[i];
            if(nums[i]==candidate) count++;
            else count--;
        }
        return candidate;
    }
    public boolean isAnagram(String s, String t) {
       int[] freq = new int[26];
       if(s.length()!=t.length()) return false;

           for(char ch:s.toCharArray()){
               freq[ch-'a']++;
           }
           for(char ch:t.toCharArray()){
                freq[ch-'a']--;
            }
        for(int count: freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public int firstUniqChar(String s) {
        int[] freq= new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++; //leetcode
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

}

public class Practice {
    public static void main(String[] args) {
        String s="leetcodel";

        Soln sol = new Soln();
//        System.out.println(sol.minElement(arr));
//        System.out.println(sol.maxElement(arr));
//        System.out.println(sol.secondLargest(arr));
//        sol.moveZeroes(arr);
//        boolean res= sol.containsDuplicate(arr);
//        System.out.println(res);
//          int[] res =sol.twoSum(arr,9);
//        System.out.println(Arrays.toString(res));

//        int res=sol.majorityElement(arr);
//        System.out.println(res);

        int res= sol.firstUniqChar(s);
        System.out.println(res);

    }
}
