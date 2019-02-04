package com.javaweb.algorithm;

import javax.sound.midi.Soundbank;

public class Rob {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int n = nums.length;
        int[] temp = new int[nums.length];
        for(int i = 0; i < temp.length; i ++){
            temp[i] = -1;
        }
        temp[n-1] = nums[n-1];

        for(int i = n-2; i >= 0; i --){
            for(int j = i; j < n; j ++){
                temp[i] = Math.max(temp[i], nums[j] + (j + 2 < n? temp[j + 2] : 0));
            }
        }

        return temp[0];
    }

    public static void main(String[] args){
        Rob r = new Rob();
        int[] a = new int[]{1,23,4,5,6,7};
        int b = r.rob(a);
        System.out.println(b);
    }


}
