package com.javaweb.leetcode;

public class IsPowerOfTwo {


    public boolean isPowerOfTwo(int n) {
        if(n < 0){
            return false;
        }
        int res = 0;
        for(int i = 0; i < 32; i ++){
            res = res + (n & 1);
            n = n >> 1;
        }
        return res == 1?true:false;
    }
}
