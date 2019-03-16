package com.javaweb.leetcode;

public class HammingWeight {
    //leetcode 191 此题使用位运算，因为int有32位，所以 i < 32
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i ++){
            int temp = n & 1;
            if(temp == 1){
                count ++;
            }
            n = n >> 1;
        }
        return count;

    }
}
