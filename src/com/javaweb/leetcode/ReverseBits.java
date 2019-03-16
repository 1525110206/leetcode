package com.javaweb.leetcode;

public class ReverseBits {
    //leetcode 190
    //位运算，每次从n中取出一位，如果为1的话，那么res左移一位加1；
    //如果为0的话，左移一位即可
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i ++){
            if((n & 1) == 1){
                res = (res << 1) + 1;
            }else{
                res = res << 1;
            }
            n = n >> 1;
        }
        return res;
    }


}
