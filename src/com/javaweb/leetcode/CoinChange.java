package com.javaweb.algorithm;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        int[] temp = new int[amount + 1];
        Arrays.fill(temp, amount + 1);
        temp[0] = 0;
        for(int i = 1; i < amount; i ++){
            for(int coin : coins){
                if(i - coin >= 0){
                    temp[i] = Math.min(temp[i], temp[i - coin] + 1);
                }
            }
        }

        return (temp[amount] == amount + 1)? -1:temp[amount];
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,5};
        CoinChange c = new CoinChange();
        System.out.println(c.coinChange(a, 11));
    }


}
