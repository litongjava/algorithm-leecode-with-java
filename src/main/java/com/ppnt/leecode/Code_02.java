package com.ppnt.leecode;

/**
 * @author Ping E Lee
 *
 */
public class Code_02 {
  // 不要提交这个类
  public static class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
      this.val = val;
    }
  }

  class Solution {
    /**
     * 链表相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int len1 = listLength(l1);
      int len2 = listLength(l2);
      ListNode l = len1 >= len2 ? l1 : l2;
      ListNode s = l == l1 ? l2 : l1;

      ListNode curL = l;
      ListNode curS = s;

      ListNode last = curL;
      int carry = 0;
      int curNum = 0;
      while (curS != null) {
        curNum = curL.val + curS.val + carry;
        curL.val = curNum % 10;
        carry = curNum / 10;
        last = curL;
        curL = curL.next;
        curS = curS.next;
      }
      while (curL != null) {
        curNum = curL.val + carry;
        curL.val = curNum % 10;
        carry = curNum / 10;
        last = curL;
        curL = curL.next;
      }

      if (carry != 0) {
        last.next = new ListNode(1);
      }
      return l;

    }

    /**
     * 求出链表的长度
     * @param head
     * @return
     */
    public int listLength(ListNode head) {
      int len = 0;
      while (head != null) {
        len++;
        head = head.next;
      }
      return len;
    }

  }
}
