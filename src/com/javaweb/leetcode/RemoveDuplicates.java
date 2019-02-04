package com.javaweb.algorithm;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int temp = nums.length - 1;
        int count = 0;
        for(int i = 0; i < temp; i ++){
            if(nums[i] == nums [i+1]){
                for(int j = i + 1; j < temp; j ++){
                    nums[j] = nums[j + 1];
                }
                count ++;
                i --;
                temp --;
            }
        }
        return temp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,2,3};
        RemoveDuplicates remove = new RemoveDuplicates();
        System.out.println(remove.removeDuplicates(nums));
    }

}
