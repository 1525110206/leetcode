package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

    public class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val;
        }

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = (l1 != null)? l1 :l2;
        return dummy;
    }

    public static void main(String[] args){
        List<? extends Object> list = new ArrayList<Integer>();
        System.out.println(String.class);
    }



}
