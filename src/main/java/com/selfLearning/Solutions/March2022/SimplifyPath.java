package com.selfLearning.Solutions.March2022;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] files = path.split("/");
        Stack<String> stringStack = new Stack();
        for (String file : files) {

            if (!file.isEmpty() && !file.equals(".") && !file.equals("..")) {
                stringStack.push(file);
            }
            if (file.equals("..") && !stringStack.isEmpty()) {
                stringStack.pop();
            }
        }
        Stack<String> tempStack = new Stack<>();
        while (!stringStack.isEmpty()) {
            tempStack.push(stringStack.peek());
            stringStack.pop();
        }
        StringBuilder result = new StringBuilder();
        while (!tempStack.isEmpty()) {
            result.append("/");
            result.append(tempStack.peek());
            tempStack.pop();
        }
        if (result.toString().isEmpty())
            return "/";
        else
            return result.toString();
    }
}

