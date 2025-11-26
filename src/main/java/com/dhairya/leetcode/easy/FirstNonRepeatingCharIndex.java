package com.dhairya.leetcode.easy;

class Find{
    public int firstUniqChar(String s) {
       int[] freq = new int[26];
       for(char ch: s.toCharArray()){
           freq[ch-'a']++;
       }

       for(int i=0;i<s.length();i++){
           if(freq[s.charAt(i)-'a']==1){
               return i;
           }
       }
        return -1;
    }
}

public class FirstNonRepeatingCharIndex {
    public static void main(String[] args) {
        String s="aabb";
        Find f= new Find();
        int res = f.firstUniqChar(s);
        System.out.println(res);

    }
}
