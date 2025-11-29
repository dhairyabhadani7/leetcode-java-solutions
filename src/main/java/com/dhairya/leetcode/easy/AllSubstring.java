package com.dhairya.leetcode.easy;

class FindAllSubstring{
    public void findSubstring(String s){
       for(int i=0;i<s.length();i++){
           for(int j=i+1;j<=s.length();j++){
               System.out.println(s.substring(i,j));
           }

       }
    }
}

public class AllSubstring {
    public static void main(String[] args) {
        String s= "abc";
       FindAllSubstring all = new FindAllSubstring();
       all.findSubstring(s);
    }
}
