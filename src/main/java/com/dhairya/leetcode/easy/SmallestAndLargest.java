package com.dhairya.leetcode.easy;

class SmallAndLarge{



    public static int isLargest(int[] arr){

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int isSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}

public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] arr= {-42,23,53,12,6,2,54,8};
        int l=SmallAndLarge.isLargest(arr);
        int s=SmallAndLarge.isSmallest(arr);
        System.out.println("Smallest: "+s+" Largest: "+l);
    }
}
