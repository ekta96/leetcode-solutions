package com.selfLearning.Solutions.March2022;

public class BrokenCalc {
    public int brokenCalc(int startValue, int target) {
        int noOfOperations = 0;
        while(target!=startValue){
            if(target%2==0 && target>=startValue){
                target = target/2;
            }
            else{
                target++;
            }
            noOfOperations++;
        }
        return noOfOperations;
    }
}
