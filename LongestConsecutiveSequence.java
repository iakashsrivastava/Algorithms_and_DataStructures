//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//
//        For example,
//        Given [100, 4, 200, 1, 3, 2],
//        The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int best = 0;
        for(int n : set) {
            if(!set.contains(n - 1)) {  // only check for one direction
                int m = n + 1;
                while(set.contains(m)) {
                    m++;
                }
                best = Math.max(best, m - n);
            }
        }
        return best;
    }
}
