package com.dhairya.leetcode.easy;

class MaxP{
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            profit=prices[i]-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        MaxP sol = new MaxP();
        int res=sol.maxProfit(arr);
        System.out.println(res);
    }
}
