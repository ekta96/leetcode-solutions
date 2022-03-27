package com;

import com.selfLearning.Solutions.March2022.NumRescueBoats;

public class RunnerClass {
    public static void main(String[] args) {
        NumRescueBoats numRescueBoats = new NumRescueBoats();
        String path = "(()(()))";
        System.out.println(numRescueBoats.numRescueBoats(new int[]{3,5,3,4},5));
    }
}
