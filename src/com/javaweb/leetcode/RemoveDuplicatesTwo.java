package com.javaweb.algorithm;

public class RemoveDuplicatesTwo {
    public int removeDuplicates(int[] nums) {
        int temp = nums.length;
        for(int i = 2; i < temp; i ++){
            if(nums[i] == nums[i - 2]){
                for(int j = i; i < temp - 1; j ++){
                    nums[j] = nums[j + 1];
                }
                i--;
                temp--;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int[] a = new int[]{1,1,1,2,2,3};
        RemoveDuplicatesTwo remove = new RemoveDuplicatesTwo();
        System.out.println(remove.removeDuplicates(a));
    }


}
