//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

//        Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
public class HouseRobber {

    public int rob(int[] nums) {

        int length = nums.length;

        if (length == 0)
            return 0;
        if (length == 1)
            return nums[0];
        if (length == 2)
            return Math.max(nums[0], nums[1]);

        int[] dp = new int[length];

        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        for (int i = 3; i < length; i++) {
            int max1 = nums[i] + dp[i - 2];
            int max2 = nums[i] + dp[i - 3];
            dp[i] = Math.max(max1, max2);
        }

        return Math.max(dp[length - 1], dp[length - 2]);
    }
}
