package code.dynamic_programming.one_dimentional;

public class HouseRobber {

    /**
     * Initialize an array dp of the same length as nums to store the maximum amount that can be robbed at each house.
     * <p>
     * The first two elements of dp are initialized based on the maximum amount that can be robbed from the first
     * two houses (nums[0] and nums[1]).
     * For each subsequent house (nums[i]), calculate the maximum amount that can be robbed:
     * The recurrence relation is defined as dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]).
     * It means that at each house, you compare the maximum amount that can be robbed if you rob the
     * current house (dp[i - 2] + nums[i]) with the maximum amount that can be robbed without robbing the
     * current house (dp[i - 1]).
     * The maximum of these two values is then stored in dp[i].
     * <p>
     * The final result is the maximum amount that can be robbed from the last house,
     * so the function returns dp[nums.length - 1].
     */
    int rob(int[] nums) {

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
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(n) where n is the length of the array
     */
}