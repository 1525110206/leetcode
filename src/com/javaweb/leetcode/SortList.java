package com.javaweb.leetcode;

public class SortList {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }


    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode second = null;
        ListNode mid = getMid(head);
        second = mid.next;
        mid.next = null; //把原来的链表断成两段
        //后面再进行归并
        ListNode l = sortList(first);
        ListNode r = sortList(second);
        return merge(l, r);
    }

    public ListNode merge(ListNode first, ListNode second){
        if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while(first != null && second != null){
            if(first.val < second.val){
                cur.next = first;
                cur = cur.next;
                first = first.next;
            } else{
                cur.next = second;
                cur = cur.next;
                second = second.next;
            }
        }
        if(first == null){
            cur.next = second;
        }
        if(second == null){
            cur.next = first;
        }
        return res.next;
    }


    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args){
        ListNode list = new ListNode(4);
        list.next = new ListNode(2);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(3);
        SortList s = new SortList();
        s.sortList(list);

    }


}
