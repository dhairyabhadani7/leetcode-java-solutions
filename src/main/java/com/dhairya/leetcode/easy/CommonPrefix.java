package com.dhairya.leetcode.easy;
class Sol9{
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null  || strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty())
                return "";
        }
       return prefix;
    }
}
public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String s=Sol9.longestCommonPrefix(strs);
        System.out.println(s);

    }
}
