package com.javaweb.leetcode;

public class QuickSort3Ways {

    public void quick(int[] nums){
        quicksort3Ways(nums, 0,  nums.length - 1);
    }

    public void quicksort3Ways(int[] nums, int l, int r){

        if(r - l <= 1){ //如果分成的部分的元素个数<=1,那必定是有序的
            return;
        }
        int v = nums[l];

        int lt = l; //nums[l + 1, lt] < v 注意这里是闭区间
        int gt = r + 1; //nums[gt, r] > v  这里是闭区间
        int i = l + 1; // nums[lt + 1, i) == v 这里是前闭后开区间，后开的原因是
        //我们要处理的就是i这里的元素
        while(i < gt){
            if(nums[i] < v){
                swap(nums, lt + 1, i);
                lt ++;
                i ++;
            }else if(nums[i] > v){
                swap(nums, gt - 1, i);
                gt --;
            }else{ // nums[i] == v
                i ++;
            }
        }
        swap(nums, l, lt);
        quicksort3Ways(nums, l, lt - 1);
        quicksort3Ways(nums, gt, r);
    }


    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{10,9,8,7,6,5,4,3,2,1};
        QuickSort3Ways q = new QuickSort3Ways();
        q.quick(nums);
        System.out.println(nums);

    }


}
