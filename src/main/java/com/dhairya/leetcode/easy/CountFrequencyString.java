package com.dhairya.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class Sol8{
    public static void countFrequency(String str){
        String[] s1=str.split(" ");
        Map<String, Integer> hm= new HashMap<>();
        for(int i=0;i<s1.length;i++){
            if(hm.containsKey(s1[i])){
                hm.put(s1[i],hm.get(s1[i])+1);
            }
            else hm.put(s1[i],1);
        }

        for (Map.Entry<String, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

public class CountFrequencyString {
    public static void main(String[] args) {
        String s="Dhairya means Patience, dhairya and he is good and sweet";
        Sol8.countFrequency(s);
    }
}
