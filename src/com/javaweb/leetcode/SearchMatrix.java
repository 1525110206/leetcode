package com.javaweb.leetcode;

public class SearchMatrix {
    //leetcode 240
    /*要充分利用这个矩阵的特性。解读一下特性，可以知道该二维矩阵的元素从左到右是递增的，从上往下也是递增的。（即按行递增，按列递增）

    我们可以先选取二维数组右上角的数字和要查找的数字（target）进行比较，如果该数字和target相等,那么查找完毕
    如果该数字和target不相等,就分大于和小于两种情况：如果该数字大于target，那么该数字所在的列就可以排除；
    如果该数字小于target，那么该数字所在的行就可以排除。
    这样我们每次比较右上角数字和target的时候都可以排除一行或者一列，一步一步的缩小比较范围，直到查找到target，或者不存在target*/
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        int row = matrix.length - 1;

        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                row --;
            } else{
                col ++;
            }
        }
        return false;

    }

    public static void main(String[] args){
        int[][] nums = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        SearchMatrix s = new SearchMatrix();
        System.out.println(s.searchMatrix(nums, -1));
    }

}
