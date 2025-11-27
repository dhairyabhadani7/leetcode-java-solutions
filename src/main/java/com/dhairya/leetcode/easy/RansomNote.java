package com.dhairya.leetcode.easy;

class Ran{
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq= new int[26];
        for(char ch: magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for (char ch: ransomNote.toCharArray()){
            freq[ch-'a']--;
        }

        for(int count: freq){
            if(count<0){
                return false;
            }
        }
        return true;
    }
}

public class RansomNote {
    public static void main(String[] args) {
      String magazine="aa";
      String ransomNote="ab";
      Ran r = new Ran();
      boolean res=r.canConstruct(ransomNote,magazine);
        System.out.println(res);
    }
}
