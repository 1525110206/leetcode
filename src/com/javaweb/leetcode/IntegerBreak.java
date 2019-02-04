package com.javaweb.algorithm;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class IntegerBreak {



    public int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        if(n < 2){
            return 0;
        }
        int[] temp = new int[n];
        for(int m = 0; m < temp.length; m++){
            temp[m] = 0;
        }
        for (int i = 2; i <= n; i ++){
            for(int j = 1; j <= i-1; j ++){

                temp[i-1] = max3(temp[i-1], j*(i-j), j*temp[i-j-1]);
            }
        }
        return temp[n-1];
    }

    private int max3(int res, int i, int i1) {
        return Math.max(res, Math.max(i, i1));
    }
    public static void main(String[] args){
        IntegerBreak a = new IntegerBreak();
        int b = a.integerBreak(4);
        System.out.println(b);
    }

}
