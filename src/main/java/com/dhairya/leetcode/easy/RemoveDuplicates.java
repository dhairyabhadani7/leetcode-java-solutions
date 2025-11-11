package com.dhairya.leetcode.easy;



// class Solution {
//     public int removeDuplicates(int[] nums) {
//      Set<Integer> lhs= new LinkedHashSet<>();
//             for(int i:nums){
//               lhs.add(i);
//             }

//     Integer[] changedArray=lhs.toArray(new Integer[0]);
//         System.out.println( Arrays.toString(changedArray));
//           return changedArray.length;
//     }
// }

class Sol1{
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}



public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,4};
        Sol1 sol=new Sol1();
        int res=sol.removeDuplicates(nums);
        System.out.println(res);
    }
}
