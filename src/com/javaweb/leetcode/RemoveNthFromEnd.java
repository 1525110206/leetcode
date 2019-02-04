package com.javaweb.algorithm;

import java.util.List;

public class RemoveNthFromEnd {

    private static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
           ListNode dummyHead = new ListNode(0);
           dummyHead.next = head;
           ListNode prev = head;
           int count = 1;
           while (prev.next != null){
               prev = prev.next;
               count++;
           }
           prev = dummyHead;
           count -= n;

           while(count > 0){
               count --;
               prev = prev.next;
           }
           ListNode ret = prev.next;
           prev.next = ret.next;
           ret.next = null;
           return dummyHead.next;

    }

    public static void main(String[] args){
        ListNode p = new ListNode(1);
        ListNode head = p;
        /*p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);*/
        RemoveNthFromEnd r = new RemoveNthFromEnd();
        ListNode a = r.removeNthFromEnd(head,1);

    }

}
