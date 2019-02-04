package com.javaweb.algorithm;

import java.util.List;

public class AddTwoNumbers {

    private class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); //虚拟头结点
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = dummyHead;
        int carry = 0;
        while(p != null || q != null){
            int val1 = (p != null)? p.val:0;
            int val2 = (q != null)? q.val:0;
            int sum = val1 + val2 + carry;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum/10;
            if(p != null){  //这里不用判断p.next是否为空，因为while一开始的时候会判断
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        if(carry > 0){
            cur.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
