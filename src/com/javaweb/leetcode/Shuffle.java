package com.javaweb.leetcode;

import java.util.Random;

public class Shuffle {

    int[] nums = null;
    Random random = new Random();

    public Shuffle(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for(int i = 0; i < nums.length; i ++){
            System.out.println(nums[i]);
        }
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums.length == 0){
            return null;
        }
        int[] a = (int[])nums.clone();
        for(int i = 1; i < nums.length; i ++){
            swap(nums, i, random.nextInt(i+1));
        }
        for(int j = 0; j < a.length; j ++){
            System.out.println(nums[j]);
        }
        return a;
    }
    private void swap(int[] nums, int left , int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        Shuffle s = new Shuffle(nums);
        s.shuffle();
        s.reset();




    }


}
