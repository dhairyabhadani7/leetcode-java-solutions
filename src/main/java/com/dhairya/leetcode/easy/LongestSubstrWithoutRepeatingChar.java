package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class LongSubstrWoutRepeatingChar{
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        int left =0;
        int maxLen = 0;

        for(int right=0;right<s.length()-1;right++){
            char ch= s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.get(ch) > 1) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++; // shrink window
            }
            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
    }
}

public class LongestSubstrWithoutRepeatingChar {

    public static void main(String[] args) {
        String s = "pwwkew";
        LongSubstrWoutRepeatingChar l = new LongSubstrWoutRepeatingChar();
       int len= l.lengthOfLongestSubstring(s);
        System.out.println(len);
    }
}
