package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinimumTotal {

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.get(triangle.size() - 1).size()][triangle.get(triangle.size() - 1).size()];

        dp[0][0] = triangle.get(0).get(0);
        if(triangle.size() > 1){
            dp[1][0] = triangle.get(1).get(0) + dp[0][0];
            dp[1][1] = triangle.get(1).get(1) + dp[0][0];
        }

        for(int i = 2; i < triangle.size(); i ++){
            for(int j = 0; j < triangle.get(i).size(); j++){
                if(j == 0){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                }else if(j == triangle.get(i).size() - 1){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                }else{
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        int temp = dp[triangle.get(triangle.size() - 1).size() - 1][0];
        for(int i = 1; i < triangle.get(triangle.size() - 1).size(); i ++){
            temp = Math.min(temp, dp[triangle.get(triangle.size() - 1).size()-1][i]);
        }
        return temp;
    }

    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(2);
        res.add(temp);
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        res.add(temp);
        temp = new ArrayList<>();
        temp.add(6);
        temp.add(5);
        temp.add(7);
        res.add(temp);
        temp = new ArrayList<>();
        temp.add(4);
        temp.add(1);
        temp.add(8);
        temp.add(3);
        res.add(temp);
        MinimumTotal min = new MinimumTotal();
        System.out.println(min.minimumTotal(res));
    }

}
