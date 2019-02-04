package com.javaweb.leetcode;

public class MaxProduct {
    //leetcode152
    /*这个题目，如果数组中全部是正数的话，那就简单很多，如果有了负数的话，就复杂一点，因为负负得正
    所以要用两个数组，一个存储最大值，一个存储最小值，假如下个数是负数，那么之前存储的最小值假如含有负数
    便可负负得正，假如不含负数，便变成负数存储起来
    假如下个数是整数，之前存储的最小值是负数的话，便变得更小，最大值是整数的话，便变得更大*/

    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 0){
            return 0;
        }
        int temp = nums[0];
        int[] maxnums = new int[nums.length];
        int[] minnums = new int[nums.length];

        maxnums[0] = nums[0];
        minnums[0] = nums[0];

        for(int i = 1; i < nums.length; i ++){
            maxnums[i] = Math.max(Math.max(maxnums[i - 1] * nums[i], minnums[i-1] * nums[i]), nums[i]);
            minnums[i] = Math.min(Math.min(maxnums[i - 1] * nums[i], minnums[i-1] * nums[i]), nums[i]);
            temp = Math.max(Math.max(maxnums[i], minnums[i]), temp);
        }
        return temp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,3,-2,4};
        MaxProduct m = new MaxProduct();
        System.out.println(m.maxProduct(nums));
    }

}
