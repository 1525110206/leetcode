package com.javaweb.leetcode;

public class GetIntersectionNode {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    //leetcode160
    //这题寻找两条链表相交的第一个节点，所以先寻找两条链表那条比较长
    //先遍历完长出来的那部分节点，然后两条链表同一起跑点，找到第一个相同的节点就是第一个相同的节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int counta = 0;
        int countb = 0;
        int diff = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a != null){
            a = a.next;
            counta ++;
        }
        while(b != null){
            b = b.next;
            countb ++;
        }
        if(counta > countb){
            diff = counta - countb;
            while(headA != null && diff != 0){
                headA = headA.next;
                diff --;
            }
        } else if(countb > counta) {
            diff = countb - counta;
            while(headB != null && diff != 0){
                headB = headB.next;
                diff --;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }


}
