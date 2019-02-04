package com.javaweb.algorithm;

public class RemoveElements {

    private class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }


    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;

        while (cur.next != null){
            if(cur.next.val == val){
                ListNode del = cur.next;
                cur.next = del.next;
                del.next = null;
            }else{
                cur = cur.next;
            }
        }

        return dummyHead.next;

    }
}
