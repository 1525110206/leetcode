package com.javaweb.algorithm;

import sun.java2d.SurfaceDataProxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
            }else{
                int count = map.get(nums[i]);
                count ++;
                map.put(nums[i], count);
            }
        }
        Set set = map.keySet();
        for(Object obj : set){
            System.out.println(obj +" : " + map.get(obj));
        }
        return nums[j];
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,5};
        FindDuplicate find = new FindDuplicate();
        find.findDuplicate(nums);
    }

}
