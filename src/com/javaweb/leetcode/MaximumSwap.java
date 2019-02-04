package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSwap {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int[] temp = new int[s.length()];
        for(int i = temp.length - 1; i >= 0; i --){
            temp[i] = s.charAt(i) - '0';  //转换成字符串之后字符变成数字 - '0'
        }
        int left = -1;    //记录要交换的较小数字下标
        int right = -1;   //记录要交换的较大数字下标
        int maxNum = -1;  //最大数字
        int maxidx = -1;  //最大数字的下标
        int res = 0;

        for(int i = temp.length - 1; i >= 0; i --){
            if(temp[i] > maxNum){
                maxidx = i;
                maxNum = temp[i];
                continue;
            }
            if(temp[i] < maxNum){
                left = i;
                right = maxidx;
            }
        }
        if(left == -1){
            return num;   //如果left仍然为-1，表示这个数字从左到右为降序，不需要交换
        }else{
            int a = temp[left];
            temp[left] = temp[right];
            temp[right] = a;
        }
        res = temp[temp.length - 1];
        int l = 10;
        for(int i = temp.length - 2; i >= 0; i --){
            res = temp[i] * l + res;
            l = l * 10;  //每次都要*10，这个容易忘记
        }

        return res;
    }

    public static void main(String[] args){
        MaximumSwap  swap = new MaximumSwap();
        System.out.println(swap.maximumSwap(98368));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(125);
        list.add(3);
        list.add(5);
        list.add(7);
        list.remove(1);
        for(Integer i : list){
            System.out.println(i);
        }

    }

}
