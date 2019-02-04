package com.javaweb.algorithm;

import java.util.List;

public class ReverseList {

    private static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while(cur.next != null){
            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return cur;
    }

    public static void main(String[] args){
        ListNode l = new ListNode(1);
        ListNode a = l;
        l.next = new ListNode(2);

        l = l.next;
        l.next = new ListNode(3);
        l = l.next;
        l.next = new ListNode(4);
        l = l.next;
        ReverseList r = new ReverseList();
        ListNode temp = r.reverseList(a);
    }

}
