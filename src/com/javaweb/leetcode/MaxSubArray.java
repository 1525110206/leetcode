package com.javaweb.algorithm;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int[] temp = new int[nums.length];
        temp[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            temp[i] = Math.max(nums[i], nums[i]+temp[i-1]);
        }
        int b = temp[0];
        for(int i = 0; i < nums.length; i ++){
            b = Math.max(temp[i], b);
        }
        return b;
    }


    public static void main(String[] args){
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray max = new MaxSubArray();
        System.out.println(max.maxSubArray(a));
    }

}
