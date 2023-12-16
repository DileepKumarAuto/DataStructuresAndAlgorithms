package leetcode.dynamic_programming.one_dimentional;

public class HouseRobber2 {

    /**
     * If there are fewer than two houses, return the only available value as it is the maximum possible loot.
     *
     * Create two arrays, skipLastHouse and skipFirstHouse, each excluding one of the adjacent houses in the
     * circular arrangement.
     * skipLastHouse excludes the last house, and skipFirstHouse excludes the first house.
     *
     * Call the robHelper function for both arrays to calculate the maximum loot for the two possibilities:
     * lootSkippingLast: Maximum loot when excluding the last house.
     * lootSkippingFirst: Maximum loot when excluding the first house.
     *
     * Return the maximum of the two calculated loots (lootSkippingLast and lootSkippingFirst).
     *
     * The robHelper function is a standard dynamic programming approach to solving the House Robber problem
     * for a linear arrangement of houses.
     * It calculates the maximum loot by considering the options of robbing or skipping each house.
     *
     * Use dynamic programming to fill the dp array, where dp[i] represents the maximum loot that can be
     * obtained up to house i.
     * The recurrence relation is dp[i] = max(dp[i-2] + nums[i], dp[i-1]).
     * Return Maximum Loot from dp:
     *
     * Return the last element of the dp array, which represents the maximum loot for the linear arrangement of houses.
     */
    int rob(int[] nums) {

        if (nums.length < 2)
            return nums[0];

        // Create 2 new arrays
        int[] skipLastHouse = new int[nums.length - 1];
        int[] skipFirstHouse = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i + 1];
        }

        // Get the loot from both the possibilities
        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);

        // Return the maximum of 2 loots
        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    private int robHelper(int[] nums) {

        if (nums.length < 2)
            return nums[0];

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }

    /**
     * Time complexity: O(n) - Linear, where 'n' is the number of houses.
     * Space complexity: O(n) - Linear, where 'n' is the number of houses.
     */


}
