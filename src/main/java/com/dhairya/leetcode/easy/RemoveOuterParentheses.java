package com.dhairya.leetcode.easy;


class RemoveOuter {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        int dep=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(dep>0){
                    sb.append(ch);
                }
                dep++;
            }
            else{
                dep--;
                if(dep>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}


public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()()())";

        String res=RemoveOuter.removeOuterParentheses(s);
        System.out.println(res);
    }
}
