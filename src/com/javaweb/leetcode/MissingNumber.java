package com.javaweb.leetcode;

public class MissingNumber {
    //leetcode 268
    //寻找缺失的那个数，利用异或的性质，x^y^y等于x，
    //temp等于nums.length的原因是，缺失了一个数，nums的区间一定是0-nums.length，
    // 这样的话，nums加上0-nums.length，每个数有两个数，缺失的数只有一个数，这样就能找出来的。
    public int missingNumber(int[] nums) {
        int temp = nums.length;
        for(int i = 0; i < nums.length; i ++){
            temp ^= i;
            temp ^= nums[i];
        }
        return temp;
    }
}
