package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        search(candidates, res, target, list, 0, set);
        for(List<Integer> s : set){
            res.add(s);
        }
        return res;
    }
    private void search(int[] nums, List<List<Integer>> res, int target, List<Integer> list, int i, HashSet<List<Integer>> set){
        for(int j = i; j < nums.length; j ++){
            if(target == nums[j]){
                list.add(nums[j]);
                set.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }else if(target > nums[j]){
                list.add(nums[j]);
                search(nums, res, target-nums[j], list, j + 1, set);
                list.remove(list.size() - 1);
            }else{
                return;
            }
        }
    }



}
