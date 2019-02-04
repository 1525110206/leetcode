package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3){
            return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i ++){
            List<Integer> list = null;
            if(nums[i] > 0){
                break;
            }
            if(i > 0  && nums[i] == nums[i - 1]){
                continue;
            }
            int temp = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] == temp){
                    list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while (left < right && nums[left] == nums[left + 1]) ++left;
                    while (left < right && nums[right] == nums[right - 1]) --right;
                    left ++;
                    right --;
                }else if(nums[left] + nums[right] < temp){
                    left ++;
                }else{
                    right -- ;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        ThreeSum t = new ThreeSum();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(t.threeSum(nums));
    }

}
