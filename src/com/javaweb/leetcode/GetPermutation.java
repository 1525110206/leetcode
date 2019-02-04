package com.javaweb.algorithm;

import java.util.Arrays;

public class GetPermutation {
    public String getPermutation(int n, int k) {
        int[] nums = new int[]{1,1,2,6,24,120,720,5040,40320,362880};
        Boolean[] isUsed = new Boolean[10]; //标记未被使用的数字
        Arrays.fill(isUsed,false);
        StringBuilder s = new StringBuilder();
        int index = n;
        int temp = 0;
        int temp1 = 0;
        while(k > 0 && index > 0){
            temp = k / nums[index-1];
            temp1 = k % nums[index-1];
            if(temp1 != 0){
                k = temp1;
                temp += 1; //后面再在寻找未被使用的数字时，是从1开始找的
            }else{
                k = nums[index - 1];
            }
            int count = 0;
            for(int i = 1; i < nums.length; i++){
                if(isUsed[i] == false){
                    count ++;
                    if(count == temp){
                        s.append(i);
                        isUsed[i] = true;
                        break;
                    }
                }
            }
            index --;
        }
        return s.toString();
    }

    public static void main(String[] args){
        GetPermutation get = new GetPermutation();
        System.out.println(get.getPermutation(4,16));
    }
}
