package com.javaweb.algorithm;

public class FindLength {
    public int findLength(int[] A, int[] B) {
        int m = A.length + 1;
        int n = B.length + 1;
        int[][] temp = new int[m][n];
        for(int i = 0; i < temp.length; i ++){
            temp[i][0] = 0;
        }
        for(int j = 0; j < temp[0].length; j++){
            temp[0][j] = 0;
        }
        for(int i = 1; i < temp.length; i ++){
            for(int j = 1; j < temp[0].length; j ++){
                if(A[i-1] == B[j-1]){
                    temp[i][j] = temp[i-1][j-1] + 1;
                }else{
                    temp[i][j] = 0;
                }
            }
        }
        int a = temp[0][0];
        for(int i = 0; i < temp.length; i ++){
            for(int j = 0; j < temp[0].length; j ++){
                 a = Math.max(a, temp[i][j]);
            }
        }
        return a;
    }

    public static void main(String[] agrs){
        int[] A = new int[]{1,2,3,2,1};
        int[] B = new int[]{3,2,1,4,7};
        FindLength find = new FindLength();
        System.out.println(find.findLength(A,B));
    }


}
