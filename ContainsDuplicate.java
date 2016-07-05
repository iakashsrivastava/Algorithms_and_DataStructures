//Given an array of integers, find if the array contains any duplicates. Your function should return true if
//        any value appears at least twice in the array, and it should return false if every element is distinct.

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for(Integer num: nums)
            if(!hs.add(num))
                return true;

        return false;
    }
}
