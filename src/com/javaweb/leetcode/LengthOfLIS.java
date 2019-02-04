package com.javaweb.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            map.put(nums[i], 1);
        }

        for(int i = 0; i < nums.length; i ++){
            for(int j = i; j >= 0; j --){
                if(nums[j] < nums[i]){
                    map.put(nums[i], Math.max(map.get(nums[i]), map.get(nums[j]) + 1));
                }
            }
        }
        int temp = 1;
        Set set = map.keySet();
        for(Object obj : set){
            temp = Math.max(temp, map.get(obj));
        }

        Set set2 = map.entrySet();
        for(Object obj : set2){
            System.out.println(obj);
        }


        return temp;
    }

    public static void main(String[] args){
        LengthOfLIS lis = new LengthOfLIS();
        int[] b = new int[]{1,2,3,9,4,7};
        int a = lis.lengthOfLIS(b);
        System.out.println(a);

    }



}
