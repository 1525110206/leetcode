package com.javaweb.algorithm;

public class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = -1;
        int right = n;
        int cur = 0;
        while(cur < right){
            if(cur < right && nums[cur] == 0){
                left ++;
                swap(nums, left, cur);
                cur ++;
                continue;
            }
            if(cur < right && nums[cur] == 1){
                cur ++;
                continue;
            }
            if(cur < right && nums[cur] == 2){
                right --;
                swap(nums, right, cur);
            }
        }
    }
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,0,2,1,1,0};
        SortColors s = new SortColors();
        s.sortColors(nums);
    }
}
