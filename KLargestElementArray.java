//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//        For example,
//        Given [3,2,1,5,6,4] and k = 2, return 5.

public class KLargestElementArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k + 1);

        for(int el : nums) {
            largeK.add(el);
            if (largeK.size() > k) {
                largeK.poll();
            }
        }

        return largeK.poll();
    }
}
