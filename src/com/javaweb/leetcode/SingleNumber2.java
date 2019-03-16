package com.javaweb.leetcode;

public class SingleNumber2 {
    //leetcode 137
    //这道题目看了答案之后理解了很久。
    //除了一个单独的数字之外，数组中其他的数字都出现了三次，那么还是要利用位操作 Bit Operation 来解此题。
    // 第一循环i，建立一个32位的数字，来统计每一位上1出现的个数，sum是用来存储每一位出现1个次数，nums[j] >> i，
    // 这个意思是数组中所有数在 i 位出现1的个数，如果sum%3为0的话，表明出现了3的倍数次，如果余1，那么就是出现了1次的那个数，
    // res |= (sum % 3) << i; 意思是把剩下的余为1的数移动到原来的位子，并且用res记录下来
    public int singleNumber(int[] nums) {

        int res = 0;

        for(int i = 0; i < 32; i ++){
            int sum = 0;
            for(int j = 0; j < nums.length; j ++){
                sum += (nums[j] >> i) & 1;
            }

            res |= (sum % 3) << i;
        }
        return res;

    }

    public static void main(String[] args){
        int[] nums = new int[]{2,2,3,2};

        SingleNumber2 s = new SingleNumber2();

        s.singleNumber(nums);

    }


}
