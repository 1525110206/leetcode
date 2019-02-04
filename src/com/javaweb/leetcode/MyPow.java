package com.javaweb.algorithm;

public class MyPow {
    public double myPow(double x, int n) {
        double r = 1;

        int len = Math.abs(n);
        for(int i = len; i > 0; i --){
            r = r * x;
        }

        if(n < 0){
            r = 1/r;
        }
        return r;
    }

    public static void main(String[] args){
        MyPow m = new MyPow();
        System.out.println(m.myPow(2.0000, 10));
    }

}
