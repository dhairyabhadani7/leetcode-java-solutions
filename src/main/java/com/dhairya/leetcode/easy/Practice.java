package com.dhairya.leetcode.easy;
import java.util.HashMap;
import java.util.Map;

class Sol{
    public int[] twoSum(int[] nums, int tar){
Map<Integer, Integer> hm = new HashMap<>();
for(int i=0;i<nums.length;i++){
int complement=tar-nums[i];
if(hm.containsKey(complement)){
    return new int[]{hm.get(complement),i};
}
else {
    hm.put(nums[i],i);
}
}
return new int[]{-1,-1};
    }
}

 class Practice{
    public static void main(String[] args) {
      int[] nums={2,7,11,15};
      int target=9;
        Sol sol=new Sol();
        int[] result=sol.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}