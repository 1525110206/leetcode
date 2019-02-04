package com.javaweb.algorithm;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        int res = 0;
        int cha = Integer.MAX_VALUE;
        int tempcha;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                tempcha = Math.abs(temp - target);
                if (tempcha < cha) {
                    cha = tempcha;
                    res = temp;
                }
                if (temp == target) {
                    return temp;
                } else if (temp < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
