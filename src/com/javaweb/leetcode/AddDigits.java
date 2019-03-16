package com.javaweb.leetcode;

public class AddDigits {
    //leetcode 258
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int a = 0;
        int b = 0;
        while(num >= 10){
            b = num % 10;
            a = a + b;
            num = num / 10;
            if(num < 10){
                num = a + num;
                a = 0;
            }

        }
        return num;

    }



    public static void main(String[] args){
        long a = 10;
        long b = 4;
        System.out.println(a / b);
    }
}
