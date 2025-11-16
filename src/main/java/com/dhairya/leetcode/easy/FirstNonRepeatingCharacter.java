package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class FirstNonRepeatingChar{
    public static char firstNonRepeatingCharacter(String s){
        Map<Character, Integer> charCount = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            charCount.put(ch[i], charCount.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(charCount.get(ch[i])==1){
                return ch[i];
            }
        }
        return 0;
    }
}

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabcc";
        char res=FirstNonRepeatingChar.firstNonRepeatingCharacter(s);
        System.out.println(res);
    }
}
