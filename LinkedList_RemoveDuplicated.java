//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//        For example,
//        Given 1->1->2, return 1->2.
//        Given 1->1->2->3->3, return 1->2->3.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LinkedList_RemoveDuplicated {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while(temp!=null && temp.next!=null){
            if(temp.val == temp.next.val)
                temp.next=temp.next.next;
            else
                temp = temp.next;
        }

        return head;

    }

}
