package com.javaweb.leetcode;

public class CanCompleteCircuit {

    //leetcode 134
    //原本是以贪心的算法的思路来做的，结果不是贪心算法
    //我们首先要知道能走完整个环的前提是gas的总量要大于cost的总量，这样必定有解。
    // 假设开始设置起点start = 0, 并从这里出发，如果当前的gas值大于cost值，就可以继续前进，
    // 此时到下一个站点，剩余的gas加上当前的gas再减去cost，看是否大于0，若大于0，则继续前进。
    // 当到达某一站点时，若这个值小于0了，则说明从起点到这个点中间的任何一个点都不能作为起点，
    // 则把起点设为下一个点，继续遍历。当遍历完整个环时，当前保存的起点即为所求。
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int temp = 0;
        int total = 0;
        int sum = 0;
        for(int i = 0; i < gas.length; i ++){
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if(sum < 0){
                temp = i + 1;
                sum = 0;
            }
        }
        return total < 0? -1 : temp;

    }

    public static void main(String[] args){
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        CanCompleteCircuit c = new CanCompleteCircuit();
        System.out.println(c.canCompleteCircuit(gas, cost));
    }



}
