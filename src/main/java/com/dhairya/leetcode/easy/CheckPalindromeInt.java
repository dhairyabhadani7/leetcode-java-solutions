package com.dhairya.leetcode.easy;

class PalindromeCheck{
    public static boolean isPalindrome(int num){

        if(num<0) return false;
        int x=num;
        int reverse=0;
        while(num>0){
            int rem= num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        return reverse==x;
    }
}
public class CheckPalindromeInt {
    public static void main(String[] args) {
        boolean res=PalindromeCheck.isPalindrome(-121);
        System.out.println(res);
    }
    }


