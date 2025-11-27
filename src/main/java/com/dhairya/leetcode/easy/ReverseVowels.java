package com.dhairya.leetcode.easy;

import java.util.Arrays;

class RevVowels{
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
      int left=0;
      int right = ch.length-1;
      while (left<right){
          if(!isVowel(ch[left])){
              left++;
              continue;
          }
          if(!isVowel(ch[right]))
          {
              right--;
              continue;
          }

              char temp = ch[left];
              ch[left]=ch[right];
              ch[right]=temp;

          left++;
          right--;

      }
        return new String(ch);
    }
}

public class ReverseVowels {
    public static void main(String[] args) {
        String s="hello";
        RevVowels revVowels= new RevVowels();
        String res=revVowels.reverseVowels(s);
        System.out.println(res);
    }
}
