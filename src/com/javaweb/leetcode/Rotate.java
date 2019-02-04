package com.javaweb.algorithm;

public class Rotate {
    private class Node{
        public int val;
        public Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void rotate(int[] nums, int k) {

        if(nums.length == 1){
            return;
        }

        int count = 0;
        Node dummy = new Node(-1);
        Node cur = dummy;
        Node curk = dummy;
        Node curi = dummy;
        for(int i = 0; i < nums.length; i ++){
            cur.next = new Node(nums[i]);
            cur = cur.next;
        }
        for(int i = 0; i <= nums.length - k; i ++){
            System.out.println(curk.val);
            count ++;
            curk = curk.next;
        }
        for(int i = 0; i < k; i ++){
            nums[i] = curk.val;
            curk = curk.next;
        }
        for(int i = k; i < nums.length; i ++){
            curi = curi.next;
            System.out.println(cur.val);
            nums[k] = curi.val;
            k++;
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2};
        Rotate r = new Rotate();
        r.rotate(nums,3);
    }
}
