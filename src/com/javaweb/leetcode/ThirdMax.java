package com.javaweb.algorithm;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        Integer maxF = null;
        Integer maxS = null;
        Integer maxT = null;
        for(Integer n : nums){
            if(n.equals(maxF) || n.equals(maxS) || n.equals(maxT)){
                continue;
            }
            if(maxF == null || n > maxF){
                maxT = maxS;
                maxS = maxF;
                maxF = n;
            }else if(maxS == null || n > maxS){
                maxT = maxS;
                maxS = n;
            }else if(maxT == null || n > maxT){
                maxT = n;
            }
        }

        return maxT == null? maxF:maxT;
    }
}
