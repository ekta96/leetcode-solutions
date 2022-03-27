package com.selfLearning.Solutions.March2022;

import java.util.Stack;

public class ScoreOfParenthesis {
    public int scoreOfParentheses(String s) {
        int scoreOfParentheses=0;
        Stack<Character> charStack =  new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(s.charAt(i+1) == '('){
                    scoreOfParentheses *= 2;
                }else{
                    scoreOfParentheses++;
                }
            }
        }
        return scoreOfParentheses;
    }
}
