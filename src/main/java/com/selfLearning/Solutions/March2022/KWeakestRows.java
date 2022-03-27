package com.selfLearning.Solutions.March2022;

import java.util.PriorityQueue;
import java.util.Queue;

public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<Integer> queue = new PriorityQueue<>();

        int count;
        for (int i = 0; i < mat.length; i++) {
            count = 0;
            for (; count < mat[0].length; count++) {
                if (mat[i][count] == 0) {
                    break;
                }
            }

            //since max length of array is 100
            queue.add(count * 100000 + i);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = queue.remove() % 100000;
        }

        return ans;
    }
}
