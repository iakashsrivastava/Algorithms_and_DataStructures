//Reverse a singly linked list.
public class LinkedList_Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, temp;

        while (head != null) {
            temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
}
