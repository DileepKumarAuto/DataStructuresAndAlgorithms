package code.dynamic_programming.one_dimentional;

import java.util.Arrays;

/**
 * Create an array dp of size amount + 1 to store the minimum number of coins needed for each amount.
 * Initialize all elements in dp with amount + 1 except for dp[0], which is set to 0,
 *
 * Use two nested loops to iterate through amounts from 1 to the target amount (amount) and coins in the coins array.
 * For each amount i, calculate the minimum number of coins needed by considering each coin.
 * Update dp[i] with the minimum value found.
 *
 * The final result is stored in dp[amount], representing the minimum number of coins needed to make up the target amount.
 *
 * If dp[amount] is still equal to amount + 1, it means it's not possible to make up the amount with the given coins,
 * and -1 is returned.
 * Otherwise, return the calculated minimum number of coins.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0 || coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }

    /**
     * Time Complexity: O(N * M) where N is the length of the coins and M is Amount
     * Space Complexity: O(N) where N is the amount.
     */
}
