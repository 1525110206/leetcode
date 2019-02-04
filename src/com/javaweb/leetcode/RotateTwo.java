package com.javaweb.algorithm;

public class RotateTwo {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for(int i = 0; i < nums.length/2; i ++){
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        for(int i = 0; i < k/2; i++){
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
        for(int i = 0; i <= (nums.length-k)/2; i ++){
            int temp = nums[k];
            nums[k] = nums[nums.length - i - 1];
            nums[nums.length - 1] = temp;
            k++;
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2};
        RotateTwo r = new RotateTwo();
        r.rotate(nums, 3);
    }
}
