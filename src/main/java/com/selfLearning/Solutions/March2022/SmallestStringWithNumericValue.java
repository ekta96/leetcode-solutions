package com.selfLearning.Solutions.March2022;

import java.util.Arrays;

public class SmallestStringWithNumericValue {
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = 'a';
            k--;
        }
        int idx = result.length - 1;
        while (k>=26) {
            result[idx]  = 'z';
            k = k-26+1;
            idx--;
        }
        result[idx] = (char) ('a' + k);
        return String.valueOf(result);
    }
}
