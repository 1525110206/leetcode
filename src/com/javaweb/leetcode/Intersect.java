package com.javaweb.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i ++){
            if(map.get(nums1[i]) == null){
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i],map.get(nums1[i]) + 1);
            }
        }
        for(int j = 0; j < nums2.length; j ++){
            if(map.get(nums2[j]) != null){
                list.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
                if((map.get(nums2[j])) == 0){
                    map.remove(nums2[j]);
                }
            }
        }
        int[] temp = new int[list.size()];
        for(int i = 0; i < list.size(); i ++){
            temp[i] = list.get(i);
        }

        return temp;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        Intersect i = new Intersect();
        System.out.println(i.intersect(nums1,nums2));
    }


}
