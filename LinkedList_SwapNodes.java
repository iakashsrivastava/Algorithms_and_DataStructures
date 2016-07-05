//Given a linked list, swap every two adjacent nodes and return its head.
//
//        For example,
//        Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//        Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class LinkedList_SwapNodes {

    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode temp2, prev = null;

        while (head != null && head.next != null) {
            int temp1 = head.val;
            head.val = head.next.val;
            head.next.val = temp1;
            head = head.next.next;
        }
        return temp;
    }
}
