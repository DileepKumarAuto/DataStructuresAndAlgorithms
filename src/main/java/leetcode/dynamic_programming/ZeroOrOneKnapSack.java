package leetcode.dynamic_programming;

public class ZeroOrOneKnapSack {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {10, 40, 30, 50, 60};
        int capacity = 8;
        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value in the knapsack: " + maxValue);
    }

    private static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }
}

