package com.javaweb.algorithm;

public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {

        int n = nums.length;
        int l = 0;
        int r = -1;
        int sum = 0;
        int res = nums.length + 1;
        while(l < n){
            if(sum < s && r+1 < n){
                sum += nums[++r];
            }else{
                sum -= nums[l];
                l ++;
            }
            if(sum >= s){
                res = Math.min(res, r-l + 1);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,3,1,2,4,3};
        MinSubArrayLen min = new MinSubArrayLen();
        System.out.println(min.minSubArrayLen(7,nums));
    }

}
