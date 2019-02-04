package com.javaweb.algorithm;

import java.util.List;

public class InsertionSortList {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        while(cur != null){
            ListNode pre = dummy;
            while(pre.next != null && cur.val > pre.next.val){
                pre = pre.next;
            }
            ListNode again = new ListNode(cur.val);
            again.next = pre.next;
            pre.next = again;
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        InsertionSortList list = new InsertionSortList();
        ListNode res = list.insertionSortList(head);

        System.out.println(Math.round(13.5));

    }
}
