//Given a singly linked list, determine if it is a palindrome.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LinkedList_Palindrome {

    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode rev = head;
        ListNode fast = head;
        ListNode temp = head;
        ListNode slow = head.next;

        //find mid pointer, and reverse head half part
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            temp = rev;
            rev = slow;
            slow = slow.next;
            rev.next = temp;
        }

        //odd number of elements, need left move slow one step
        if(fast.next == null) {
            rev = rev.next;
        }
        else {   //even number of elements, do nothing

        }
        //compare from mid to head/tail
        while(slow != null) {
            if(rev.val != slow.val) {
                return false;
            }
            rev = rev.next;
            slow = slow.next;
        }
        return true;
    }

}
