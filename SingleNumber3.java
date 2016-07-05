//Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
//
//        For example:
//
//        Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
//
//        Note:
//        The order of the result is not important. So in the above example, [5, 3] is also correct.
//        Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
public class SingleNumber3 {

    public int[] singleNumber(int[] nums) {
        int j=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            if( hs.contains(nums[i]) )
                hs.remove(nums[i]);
            else
                hs.add(nums[i]);


        Iterator iterator = hs.iterator();

        int[] i = new int[2];
        while (iterator.hasNext()){
            i[j++] = (int)iterator.next();
        }
        return i;

    }
}
