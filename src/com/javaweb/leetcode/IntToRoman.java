package com.javaweb.algorithm;

public class IntToRoman {
    public String intToRoman(int num) {
        int[] temp = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String temp2[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder res = new StringBuilder();
        for(int i = temp.length - 1; i >= 0; i --){
            if(num >= temp[i]){
                res.append(temp2[i]);
                num = num - temp[i];
                i ++;
            }
        }
        return res.toString();
    }

    public static void main(String[] agrs){
        IntToRoman i = new IntToRoman();
        System.out.println(i.intToRoman(58));
    }
}
