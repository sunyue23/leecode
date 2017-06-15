package com.kingnet.sy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunyue on 2017/6/6.
 */
public class LeeCode2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode c1 = l1;
        l1.next = new ListNode(4);l1 =l1.next;
        l1.next = new ListNode(3);l1 = l1.next;

        ListNode l2 = new ListNode(5);
        ListNode c2 = l2;
        l2.next = new ListNode(6);l2 =l2.next;
        l2.next = new ListNode(4);l2 = l2.next;
        addTwoNumbersOfMe(c1,c2);
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode addTwoNumbersOfMe(ListNode l1, ListNode l2) {
        int init = (l1.val+l2.val)%10;
        int jinwei = (l1.val+l2.val)/10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode result = new ListNode(init);
        ListNode tem = result;
        List list = new ArrayList<Integer>();


        while(l1 != null && l2 != null){
            int temp = (l1.val+l2.val+jinwei)%10;
            result.next = new ListNode(temp);
            result = result.next;
            jinwei = (l1.val+l2.val+jinwei)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int temp = (l1.val+jinwei)  %10;
            result.next = new ListNode(temp);
            jinwei = (l1.val+jinwei)/10;
            result = result.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int temp = (l2.val+jinwei)  %10;
            result.next = new ListNode(temp);
            jinwei = (l2.val+jinwei)/10;
            result = result.next;
            l2 = l2.next;
        }
        if(jinwei !=0){
            result.next = new ListNode(jinwei);
            result = result.next;
        }

        return tem;
    }
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode c1 = l1;
            ListNode c2 = l2;
            ListNode sentinel = new ListNode(0);
            ListNode d = sentinel;
            int sum = 0;
            while (c1 != null || c2 != null) {
                sum /= 10;
                if (c1 != null) {
                    sum += c1.val;
                    c1 = c1.next;
                }
                if (c2 != null) {
                    sum += c2.val;
                    c2 = c2.next;
                }
                d.next = new ListNode(sum % 10);
                d = d.next;
            }
            if (sum / 10 == 1)
                d.next = new ListNode(1);
            return sentinel.next;
        }
}
