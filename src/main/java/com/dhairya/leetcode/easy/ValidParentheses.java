package com.dhairya.leetcode.easy;

import java.util.Stack;

class Sol{
    public static boolean isValid(String str){
        Stack<Character> characterStack = new Stack<>();
        char[] ch= str.toCharArray();
        for(char c: ch){
            if( c== '(' || c== '{' || c=='['){
                characterStack.push(c);
        }
            else {
                if(characterStack.isEmpty()){
                    return false;
                }
                char top=characterStack.pop();
                if(c==')' && top!='(' ||
                   c=='}' && top!='{' ||
                   c==']' && top!='['){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()(){";
        boolean res =Sol.isValid(str);
        System.out.println(res);
    }

}
