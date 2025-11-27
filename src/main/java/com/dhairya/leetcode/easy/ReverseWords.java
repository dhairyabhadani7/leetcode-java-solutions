package com.dhairya.leetcode.easy;

class Sol5{
    public static String reverseWords(String str){
        String[] s1= str.trim().split("\\s+");
        for(int i=0;i<s1.length/2;i++){
            String temp=s1[i];
            s1[i]=s1[s1.length-i-1];
            s1[s1.length-i-1]=temp;
        }

        return String.join(" ",s1);
    }

}

public class ReverseWords {
    public static void main(String[] args) {
        String s= "   the sky is   blue  ";
        String str= Sol5.reverseWords(s);
        System.out.println(str);
    }
}
