package com.javaweb.algorithm;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int[] a = new int[nums.length];
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                a[b] = nums[i];
                b++;
            }
        }
        for(int j = b; j < nums.length; j++){
            a[j] = 0;
        }
        for(int m = 0; m < a.length; m ++){
            System.out.println(a[m]);
        }
    }

    public void moveZeroesTwo(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i ++;
            }
        }
        for(int m = i; m < nums.length; m ++){
            nums[m] = 0;
        }
    }


    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,3,12};
        MoveZeroes move = new MoveZeroes();
        move.moveZeroesTwo(nums);

    }

}

