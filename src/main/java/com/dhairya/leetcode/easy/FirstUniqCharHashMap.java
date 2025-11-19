package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class FirstUniq{
    public static int firstuniqCharacter(String s){
        Map<Character,Integer> charCount = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            charCount.put(ch[i],charCount.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(charCount.get(ch[i])==1){
                return i;
            }
        }
        return -1;
    }
}

public class FirstUniqCharHashMap {
    public static void main(String[] args) {
        String s = "aabbcc";
        int res=FirstUniq.firstuniqCharacter(s);
        System.out.println(res);
    }
}
