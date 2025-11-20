package com.dhairya.leetcode.easy;


class Dada{
    public String stringAToUnaryConversion(String s){
        return s.toLowerCase().
                replace("plus","+").
                replace("minus","-").
                replace("mul","*").
                replace("div","/");
    }
}

public class StringToUnary {
    public static void main(String[] args) {
        String s1="plusminusmuldivminusplusdivmul";
        String s2="divminusmulplusminusplusdivmul";

        Dada d = new Dada();
        String s= d.stringAToUnaryConversion(s1);
        System.out.println(s);
        System.out.println(d.stringAToUnaryConversion(s2));

    }
}
