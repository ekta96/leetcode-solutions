package com.leetcode.solutions;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = new int[]{7, 1, 5, 3, 6, 4};
        int max_profit = findMaxProfit(prices);
        System.out.println(max_profit);
    }

    private static int findMaxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int max_profit = 0;
        for(int price : prices)
        {
            if(price<buy)
                buy = price;
            if(price>sell)
                sell = price;
            if(max_profit<(sell-buy))
                max_profit = sell-buy;

        }
        return max_profit;
    }



}
