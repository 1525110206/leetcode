package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = null;
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length == 4 && (nums[0] + nums[1] + nums[2] + nums[3] == target)) {
            list = new ArrayList<>();
            list.add(nums[0]);
            list.add(nums[1]);
            list.add(nums[2]);
            list.add(nums[3]);
            res.add(list);
            return res;
        }
        if (nums.length < 4) {
            return res;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = nums.length - 1; j > i + 2; j--) {
                int left = i + 1;
                int right = j - 1;
                while (left < right) {
                    int temp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (target == temp) {
                        list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        list.add(nums[j]);
                        set.add(list);
                        left++;
                    } else if (temp < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        for (List<Integer> t : set) {
            res.add(t);
        }
        return res;
    }




    public static void main(String[] args){
        FourSum f = new FourSum();
        int[] nums = new int[]{5,5,3,5,1,-5,1,-2};
        System.out.println(f.fourSum(nums,4));

    }

}
