package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Integer, Boolean> map = new HashMap<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){

        if(nums.length == 0){
            return res;
        }
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], false);
        }
        List<Integer> p = new ArrayList<>();
        back(nums, 0, p);
        return res;
    }

    private void back(int[] nums, int i, List<Integer> p) {
        if(i == nums.length){
            res.add(p);
            return;
        }
        for(int j = 0; j < nums.length; j++){
            if(!map.get(nums[j])){
                p.add(nums[j]);
                System.out.println(j+",++++"+nums[j]);
                map.put(nums[j], true);
                back(nums, i + 1, p);
                p.clear();
                map.put(nums[j], false);
            }
        }
    }

    public static void main(String[] args){
        Solution s= new Solution();
        int[] a = new int[]{1,2,3};
        List<List<Integer>> b = s.permute(a);
        System.out.println(b.size());

        String s1 = "abcdn";
        System.out.println(s1.substring(0,1));

    }
}
