package com.javaweb.leetcode;

public class SingleNumber {
    //leetcode 136
    //这个问题的解答很巧妙，利用异或运算，相同为0，不同为1，
    // 如果有数字出现两次，那么这两个数字异或肯定是为0的，剩下的那一个就是出现一次的数字.
    // 注意：这里的数字进行异或运算是要转换成二进制数的
    public int singleNumber(int[] nums) {

        int temp = 0;
        for(Integer num : nums){
            temp = temp ^ num;
        }
        return temp;
    }


    public static void main(String[] args){

        int[] nums = new int[]{4,1,2,1,2};
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(nums));

    }

}
