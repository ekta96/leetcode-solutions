package com.selfLearning.Solutions.March2022;

import java.util.Stack;

public class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> arrayStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!(charArray[i] >= 'a' && charArray[i] <= 'z')) {
                if (charArray[i] == ')') {
                    if (arrayStack.isEmpty()) {
                        charArray[i] = '.';
                    } else {
                        arrayStack.pop();
                    }
                }
                if (charArray[i] == '(') {
                    arrayStack.push(i);
                }
            }
        }
        while (!arrayStack.isEmpty()) {
            charArray[arrayStack.pop()] = '.';
        }
        for (char chr : charArray) {
            if (chr != '.') {
                result.append(chr);
            }
        }
        return result.toString();
    }
}
