package com.dhairya.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class RemoveDupChars{
    public static String removeDuplicateCharacters(String str){
        Set<Character> hs= new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] ch=str.toCharArray();
        for(char c: ch){
            if(!hs.contains(c)) {
                hs.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

public class RemoveDuplicatesCharaters {
    public static void main(String[] args) {
     String s="programming";
    String s1= RemoveDupChars.removeDuplicateCharacters(s);
    System.out.println(s1);

    }
}
