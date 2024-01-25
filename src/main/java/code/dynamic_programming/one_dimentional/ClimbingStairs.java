package code.dynamic_programming.one_dimentional;

public class ClimbingStairs {

    /**
     * Create an array dp of size n+1 to store the number of distinct ways to reach each step.
     * Set dp[0] = 0 and dp[1] = 1 since there is one way to reach the first step.
     *
     * Use a for loop to iterate from i = 2 to n.
     * At each iteration, calculate the number of distinct ways to reach the current step i using the formula:
     * dp[i] = dp[i-1] + dp[i-2].
     * This formula represents the fact that you can reach the current step either from the step immediately
     * before it (dp[i-1]) or from the step two steps before it (dp[i-2]).
     *
     * After the loop completes, dp[n] contains the number of distinct ways to reach the top of the staircase
     * with n steps, and the function returns this value.
     */

    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    /**
     * Time complexity : O(N) where n is the input range
     * Space complexity : O(N) where n is the input range
     */

}
