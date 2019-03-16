package com.javaweb.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FractionToDecimal {
    //leetcode 166
    //因为要考虑溢出的问题，所以把两个数转化为更大类型的数，首先要处理符号问题，如果两个数都是负数，那结果也为正，如果一正一负，
    // 结果为负，通过两个if 和一个标志位flag，这个逻辑蛮好的。
    //下面寻找循环体，beginIndex 表示循环体开始的地方，index表示循环体有多少位
    //map存放的是被除数，list存放的是余数，这个要搞清楚。
    public String fractionToDecimal(int numerator, int denominator) {
        return fractionToDec(numerator, denominator);
    }

    private String fractionToDec(long numerator, long denominator){
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        if(numerator < 0){
            flag = !flag;
        }
        if(denominator < 0){
            flag = !flag;
        }
        if(!flag && 0 != numerator){
            stringBuilder.append("-");
        }
        long num = Math.abs(numerator);
        long den = Math.abs(denominator);

        long integer = num / den;
        stringBuilder.append(integer);
        if(num % den == 0){
            return stringBuilder.toString();
        }
        stringBuilder.append(".");
        int index = 0;
        int beginIndex = -1;
        Map<Long, Integer> map = new HashMap<>();
        List<Long> list = new ArrayList<>();
        num = (num % den) * 10;

        while(num != 0){

            if(map.containsKey(num)){
                beginIndex = map.get(num);
                break;
            }else{
                map.put(num, index ++);
                long val = num / den;
                list.add(val);
                num = (num % den) *10;
            }
        }

        for(int i = 0; i < index; i ++){
            if(i == beginIndex){
                stringBuilder.append("(");
            }
            stringBuilder.append(list.get(i));
        }

        if(beginIndex != -1){
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }



    public static void main(String[] args){
        FractionToDecimal f = new FractionToDecimal();
        f.fractionToDecimal(2, 3);
    }

}
