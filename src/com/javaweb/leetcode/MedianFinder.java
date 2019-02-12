package com.javaweb.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    public static Comparator<Integer> comp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    };
    PriorityQueue<Integer> minHeap = null;
    PriorityQueue<Integer> maxHeap = null;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(comp);

    }
    public void addNum(int num) {
        if(maxHeap.isEmpty() && num < maxHeap.peek()){
            maxHeap.add(num);
        } else{
            minHeap.add(num);
        }

        if(maxHeap.size() == minHeap.size()+2){
            minHeap.add(maxHeap.poll());
        }
        if(minHeap.size() == maxHeap.size()+2){
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if(maxHeap.size() - minHeap.size() == 0){
            return (double) (maxHeap.peek() + minHeap.peek())/2;
        }else {
            if(maxHeap.size() > minHeap.size()){
                return maxHeap.peek();
            } else {
                return minHeap.peek();
            }
        }
    }

    public static void main(String[] args){
        MedianFinder m = new MedianFinder();
        m.addNum(1);
        m.addNum(2);
        System.out.println(m.minHeap.size());
    }


}
