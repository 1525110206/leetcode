package com.javaweb.leetcode;

public class ProductExceptSelf {
    //leetcode 238
    //定义两个数组，一个从左边遍历，一个从右边遍历，一路乘
    //那么输出数组的值就等于left - 1 * right + 1
    //注意边界问题
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];
        for(int i = 1; i < nums.length; i ++){
            left[i] = left[i - 1] * nums[i];
        }
        for(int i = nums.length - 2; i >=0 ; i --){
            right[i] = right[i + 1] * nums[i];
        }
        for(int i = 0; i < nums.length; i ++){
            if(i == 0){
                output[i] = right[i + 1];
            } else if(i == nums.length - 1){
                output[i] = left[nums.length - 2];
            } else{
                output[i] = left[i - 1] * right[i + 1];
            }
        }
        return output;

    }

}
