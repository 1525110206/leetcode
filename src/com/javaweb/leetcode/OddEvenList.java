package com.javaweb.leetcode;

public class OddEvenList {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    //leetcode 328
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //定义两个指针分别指向奇偶序号头部，遍历，当遍历到链表末尾时，将奇链表直接指向偶链表头部即可
        ListNode odd = head;
        ListNode even = head.next;
        //定义这个不随遍历变动的变量是为了一直指向偶数序号头部，便于奇尾部直接连上偶数头部
        ListNode temp = even;
        //1->null  even==null
        //  1->2->null     even.next==null
        // 1->2->3->null  奇数个链表节点时，even指向null，even==null，就该退循环
        // 1->2->3->4->null 偶数个链表节点时，even指向4，但是even.next==null，就该退循环
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = temp;
        return head;
    }

    public static void main(String[] args){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        OddEvenList o = new OddEvenList();
        System.out.println(o.oddEvenList(list));
    }
}
