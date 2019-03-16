package com.javaweb.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSmaller {

    //leetcode 315
    //之所以要从右向左拿来排序，是因为题目要求的是当前数右侧小于当前数的个数，如果从左向右的话，
    // 求的就是当前数左侧小于当前数的个数，将给定数组从最后一个开始，用二分法插入到一个新的数组，
    // 这样新数组就是有序的，那么此时该数字在新数组中的坐标就是原数组中其右边所有较小数字的个数
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int len = nums.length;
        Integer[] result = new Integer[len];
        for(int i = len-1;i>=0;i--) {
            //将每个数插入到list中//使用二分查找
            int start = 0; int end = list.size();

            while(start<end) {
                int middle = start+(end-start)/2;
                //判断中间的数
                if(list.get(middle) < nums[i]) {//严格小于的话，只能在后面部分，并且不包含middle
                    start = middle+1;
                }else {
                    end = middle;
                }
            }
            result[i] = start;
            list.add(start,nums[i]);
        }
        return Arrays.asList(result);
    }


    public static void main(String[] args){
        int[] nums = new int[]{5,2,6,1};
        CountSmaller c = new CountSmaller();
        System.out.println(c.countSmaller(nums));

    }



}
