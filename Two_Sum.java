import java.util.HashMap;

/**
 * Created by akash on 5/25/16.
 */

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution.
//
//        Example:
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

public class Two_Sum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int index=0; index<nums.length; index++){

            if (map.containsKey(target-nums[index]))
                return new int[]{ map.get( target-nums[index]), index };

            map.put(nums[index], index);
        }

        return null;

    }

}