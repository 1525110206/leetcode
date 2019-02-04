package com.javaweb.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    Queue<Integer> queue = null;


    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        if(t - queue.peek() > 3000){
            queue.remove();
        }
        return queue.size();
    }



}
