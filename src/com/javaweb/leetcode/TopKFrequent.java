package com.javaweb.leetcode;

import java.util.*;

public class TopKFrequent {


    //leetcode 347
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            if(map.get(nums[i]) != null){
                map.put(nums[i], map.get(nums[i])+1);
            } else{
                map.put(nums[i], 1);
            }
        }
        //add进优先队列是用map的value值决定的
        PriorityQueue<Integer> p = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );
        for(Integer m : map.keySet()){
            if(p.size() < k){
                p.add(m);
            } else{
                if(map.get(m) > map.get(p.peek())){

                    p.remove();
                    p.add(m);
                }
            }
        }
        while(p.size() != 0){
            list.add(p.peek());
            p.remove();
        }
        for(int i = 0, j = list.size()-1; i < j; i ++, j--){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        return list;
    }


    public static void main(String[] args){
        int[] nums = new int[]{1,2,2,3,3,3};
        TopKFrequent t = new TopKFrequent();
        t.topKFrequent(nums, 2);
    }

}
