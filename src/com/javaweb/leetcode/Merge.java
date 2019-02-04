package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {

    static class  Interval{
        int start;
        int end;
        public Interval() {
            start = 0;
            end = 0;
        }
        public Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i = 0; i < n; i ++){
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval> res = new ArrayList<>();
        for(int i = 0, j = 0; i < n; i ++){
            if(i == n-1 || start[i + 1] > end[i]){
                res.add(new Interval(start[j], end[i]));
                j = i + 1;
            }

        }
        return res;
    }

    public static void main(String[] args){
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));
        Merge m = new Merge();
        m.merge(intervals);
    }

}
