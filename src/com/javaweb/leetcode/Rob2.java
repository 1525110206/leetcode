package com.javaweb.leetcode;

public class Rob2 {
    //leetcode 213
    //这个题目是在打家劫舍一的基础上来的，在打家劫舍一代码的基础上，思路是这样的
    //第一家和最后一家只能偷一家，要么都不偷，我们可以先去掉第一家，求出最大值是多少，
    // 再去掉最后一家，求出最大值是多少，然后取两个值的最大值就可以了
    //下面这个解法不好，空间复杂度太高，但懒得调试代码了
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        for(int i = 0; i < n - 1; i ++){
            a[i] = nums[i];
        }
        for(int j = 1; j < n; j ++){
            b[j - 1] = nums[j];
        }
        int c = robber(a);
        int d = robber(b);

        return Math.max(c, d);

    }

    private int robber(int[] nums){
        int n = nums.length;
        int[] temp = new int[n];
        temp[n - 1] = nums[n - 1];
        for(int i = n - 1; i >= 0; i --){
            for(int j = i; j < n; j ++){
                temp[i] = Math.max(temp[i], nums[j] + (j + 2 < n? temp[j + 2]:0));
            }
        }
        return temp[0];
    }

}
