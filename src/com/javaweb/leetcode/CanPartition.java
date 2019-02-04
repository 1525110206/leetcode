package com.javaweb.algorithm;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class CanPartition {

    public boolean canPartition(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        int c = sum/2;
        boolean[] temp = new boolean[c + 1];

        for(int j = 0; j <= c; j ++){
            temp[j] = (j == nums[0]);
        }
        for(int m = 1; m < nums.length; m ++){
            for(int n = c; n >= nums[m]; n--){
                temp[n] = temp[n] || temp[n - nums[m]];
            }
        }
        return temp[c];
    }

    public static void main(String[] args){
        int[] a = new int[]{1,1};
        CanPartition can = new CanPartition();
        System.out.println(can.canPartition(a));

        Set set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set.size());

        String[] s1 = new String[]{"c","c"};
        String s2 = "c";

        System.out.println(s1[1] == s2);



    }


}
