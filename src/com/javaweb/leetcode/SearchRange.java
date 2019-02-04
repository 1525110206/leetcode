package com.javaweb.algorithm;

public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] temp = new int[2];
        int res = nums.length;
        int right = nums.length;
        int left = 0;
        while(left < right){
            int middle = (left + right)/2;
            if(nums[middle] == target){
                res = middle;
                break;
            }else if(nums[middle] < target){
                left = middle + 1;
            }else{
                right = middle;
            }
        }
        if(res == nums.length){
            temp[0] = -1;
            temp[1] = -1;
        }else{
            int i = Integer.MAX_VALUE;
            int j = Integer.MAX_VALUE;
            for(i = res; i < nums.length; i ++){
                if(nums[i] == target){
                    continue;
                }else{
                    temp[1] = i - 1;
                    break;
                }
            }
            for(j = res; j >= 0; j --){
                if(nums[j] == target){
                    continue;
                }else{
                    temp[0] = j + 1;
                    break;
                }
            }
            if(i == nums.length){
                temp[1] = nums.length - 1;
            }
            if(j == -1){
                temp[0] = 0;
            }
        }

        return temp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,3};
        SearchRange s = new SearchRange();
        System.out.println(s.searchRange(nums, 1));
    }

}

