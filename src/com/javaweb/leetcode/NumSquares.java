package com.javaweb.leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumSquares {

    public int numSquares(int n) {
        int[] temp = new int[n + 1];
        temp[0] = 0;
        for(int i = 1; i < n + 1; i ++){
            temp[i] = Integer.MAX_VALUE;
        }


        for(int i = 0; i < n + 1; i ++){
            for(int j = 1; i + j * j <= n; j++){
                temp[i + j * j] = Math.min(temp[i + j * j], temp[i] + 1);
            }
        }
        return temp[n];
    }


    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        Set set = map.entrySet();
        Set a = map.keySet();
        Collection b = map.values();

        for(Object obj : set){
            Map.Entry s = (Map.Entry)obj;
            System.out.println(s);
        }

    }

}
