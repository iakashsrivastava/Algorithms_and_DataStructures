//Given a linked list, remove the nth node from the end of list and return its head.
//
//        For example,
//
//        Given linked list: 1->2->3->4->5, and n = 2.
//
//        After removing the second node from the end, the linked list becomes 1->2->3->5.
//        Note:
//        Given n will always be valid.
//        Try to do this in one pass.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LinkedList_RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode h1=head, h2=head;
        while(n-->0) h2=h2.next;
        if(h2==null)return head.next;  // The head need to be removed, do it.
        h2=h2.next;

        while(h2!=null){
            h1=h1.next;
            h2=h2.next;
        }
        h1.next=h1.next.next;   // the one after the h1 need to be removed
        return head;
    }

}
