package com.selfLearning.Solutions.March2022;

public class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        int numRescueBoats = 0;
        int persons = 0;
        int rem = 0;
        for (int p : people) {
            persons += p;
            rem = persons % limit;
            if (persons > limit) {
                numRescueBoats++;
                persons = p;
            }
            if (rem == 0) {
                numRescueBoats++;
                persons = 0;
            }


        }
        return numRescueBoats;
    }
}
