//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LinkedList_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0, sum =0;
        ListNode head =null, temp=null;

        while(l1 != null || l2 != null){

            if(l1 != null && l2 != null){
                sum = l1.val + l2.val+ carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l2 == null){
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else{
                sum = l2.val+ carry;
                l2 = l2.next;
            }

            if(head == null){
                head = new ListNode(sum%10);
                temp = head;
            }
            else {
                temp.next = new ListNode(sum%10);
                temp = temp.next;
            }

            carry = sum /10;
        }
        if(carry > 0)
            temp.next = new ListNode(carry);

        return head;
    }

}
