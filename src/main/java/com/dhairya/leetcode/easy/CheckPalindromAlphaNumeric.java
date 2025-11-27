package com.dhairya.leetcode.easy;

class Palindrome{
    public boolean isPalindrome(String s) {
      int left=0;
      int right =s.length()-1;
      while(left<right){
      if(!Character.isLetterOrDigit(s.charAt(left))){
          left++;
          continue;
      }
      if(!Character.isLetterOrDigit(s.charAt(right))){
          right--;
          continue;
      }
      if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
          return false;

      }
          left++;
          right--;
      }
        return true;
    }
}

public class CheckPalindromAlphaNumeric {
    public static void main(String[] args) {
      String s="A man, a plan, a canal: Panama";
      String s1="race a car";
      Palindrome p = new Palindrome();
      boolean res = p.isPalindrome(s);
      System.out.println(res);
    }
}
