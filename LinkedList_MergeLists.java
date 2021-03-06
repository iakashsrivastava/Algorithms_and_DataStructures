//Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

public class LinkedList_MergeLists {

    public ListNode mergeKLists(ListNode[] lists) {

        Queue<ListNode> heap = new PriorityQueue(new Comparator<ListNode>(){
            @Override public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });

        ListNode head = new ListNode(0), tail = head;

        for (ListNode node : lists) if (node != null) heap.offer(node);

        while (!heap.isEmpty()) {
            tail.next = heap.poll();
            tail = tail.next;
            if (tail.next != null) heap.offer(tail.next);
        }

        return head.next;
    }


}
