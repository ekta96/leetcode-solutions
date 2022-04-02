package com.selfLearning.Solutions.April2022;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int deleteChar = 0;
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start) != s.charAt(end))
            {
                return (checkPalindrome(s, start, end - 1) || checkPalindrome(s, start + 1, end));
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean checkPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
