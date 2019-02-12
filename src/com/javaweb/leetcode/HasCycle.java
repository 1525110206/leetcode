package com.javaweb.leetcode;

public class HasCycle {

    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    //leetcode 141
    //在一个环形跑道上，一个跑得快的运动员，一个跑得慢的运动员，早晚会相遇
    //所以可以使用双指针，一个一次跑一步，一个一次移动两步
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            } else{
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return true;
    }
}
