package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(candidates, res, temp, target, 0);
        return res;
    }

    private void getResult(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int pos){
        for(int i = pos; i < candidates.length; i++){
            if(target == candidates[i]){
                temp.add(candidates[i]);
                res.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
                return;
            }else if(target > candidates[i]){
                temp.add(candidates[i]);
                getResult(candidates,res,temp,target-candidates[i], i);
                temp.remove(temp.size() - 1);
            }else{
                return;
            }
        }
    }
    public static void main(String[] args){
        int[] nums = new int[]{2,3,6,7};
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(nums,7));
    }
}
