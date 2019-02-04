package com.javaweb.algorithm;

import java.util.Arrays;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        if(prices.length == 0){
            return 0;
        }
        int[] temp = new int[prices.length];
        Arrays.fill(temp, 0);

        for(int i = 0; i < prices.length; i ++){
            for(int j = i + 1; j < prices.length; j ++){
                temp[i] = Math.max(temp[i], prices[j] - prices[i]);
            }
        }
        int a = temp[0];
        for(int i = 1; i < temp.length; i++){
            a = Math.max(a, temp[i]);
        }

        return a;

    }
}
