package com.javaweb.leetcode;

public class CountPrimes {
    //leetcode204 这题用了一个算法
    //这个算法的过程如下
    //我们从2开始遍历到n，先找到第一个质数2，然后将其所有的倍数全部标记出来，然后到下一个质数3，标记其所有倍数，
    // 一次类推，直到n，此时数组中未被标记的数字就是质数。我们需要一个n-1长度的bool型数组来记录每个数字是否被标记，
    // 长度为n-1的原因是题目说是小于n的质数个数，并不包括n。 然后我们来实现埃拉托斯特尼筛法，难度并不是很大
    public int countPrimes(int n) {
        int res = 0;
        boolean[] temp = new boolean[n];
        for(int i = 0; i < temp.length; i ++){
            temp[i] = true;
        }
        for(int i = 2; i < temp.length; i++){
            if(temp[i]){
                res ++;
                for(int j = 2; i * j < temp.length; j ++){
                    temp[i * j] = false;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int c = 3;
        System.out.println(c & 1);
    }



}
