package com.javaweb.leetcode;

public class IncreasingTriplet {

    //leetcdoe334
    /*我们下面来看满足题意的方法，这个思路是使用两个指针m1和m2，初始化为整型最大值，我们遍历数组，如果m1大于等于当前数字
    则将当前数字赋给m1；如果m1小于当前数字且m2大于等于当前数字，那么将当前数字赋给m2，一旦m2被更新了，说明一定会有一个数小于m2
    那么我们就成功的组成了一个长度为2的递增子序列，所以我们一旦遍历到比m2还大的数，我们直接返回ture。如果我们遇到比m1小的数
    还是要更新m1，有可能的话也要更新m2为更小的值，毕竟m2的值越小，能组成长度为3的递增序列的可能性越大*/
    public boolean increasingTriplet(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        int m = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] <= m){
                m = nums[i];
            }else if(nums[i] <= n){
                n = nums[i];
            }else{
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args){
        int[] nums = new int[]{0,4,2,1,0,-1,-3};
        IncreasingTriplet i = new IncreasingTriplet();
        System.out.println(i.increasingTriplet(nums));
    }
}
