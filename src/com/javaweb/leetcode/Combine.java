package com.javaweb.algorithm;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    List<List<Integer>> res  = new ArrayList<>();
    public List<List<Integer>> combineT(int n, int k) {
        List<Integer> p = new ArrayList<>();
        if(k > n){
            return res;
        }
        back(n, 1, p, k);
        return res;
    }

    private void back(int n, int start, List<Integer> p, int k) {
        if(p.size() == k){
            res.add(new ArrayList<>(p));
            return;
        }
        for(int j = start; j <= n; j ++){
            p.add(j);
            back(n, j+1, p, k);
            p.remove(p.size() - 1);
        }
    }
    public static void main(String[] args){
        Combine c = new Combine();
        List<List<Integer>> a = c.combineT(3,2);
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
