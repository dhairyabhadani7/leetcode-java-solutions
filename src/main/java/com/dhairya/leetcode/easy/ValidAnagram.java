package com.dhairya.leetcode.easy;

class Sol11 {
    public static boolean isAnagram(String str, String tr) {
        if (str.length() != tr.length()) return false;
        int[] freq = new int[26];

            for (char s : str.toCharArray()) {
                freq[s - 'a']++;
            }
            for (char t : tr.toCharArray()) {
                freq[t - 'a']--;
            }
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        String s= "anagram";
        String t="nagrama";
        boolean b= Sol11.isAnagram(s,t);
        System.out.println(b);
    }
}
