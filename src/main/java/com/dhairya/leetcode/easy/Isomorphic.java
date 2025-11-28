package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class CheckIso{
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If s→t mapping exists, ensure it matches
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    return false;
                }
            }
            // If t→s mapping exists, ensure it matches
            else if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    return false;
                }
            }
            else {
                // Create new mapping both ways
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }

        return true;
    }
}

public class Isomorphic {
    public static void main(String[] args) {
     String s="foo";
     String t="bar";
     CheckIso iso = new CheckIso();
     boolean res=iso.isIsomorphic(s,t);
        System.out.println(res);
    }
}
