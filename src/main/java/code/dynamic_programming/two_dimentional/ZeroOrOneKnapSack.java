package code.dynamic_programming.two_dimentional;

public class ZeroOrOneKnapSack {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {10, 40, 30, 50, 60};
        int capacity = 8;
        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value in the knapsack: " + maxValue);
    }


    /**
     *
     * Initialize a 2D array dp of size (n + 1) x (capacity + 1) to store the maximum values that can be obtained
     * for different sub problems.
     * dp[i][w] represents the maximum value that can be obtained with the first i items,
     * considering a knapsack capacity of w.
     * Initialize the first row (i = 0) and the first column (w = 0) of dp to 0, as there is no weight or value
     * when no items are selected.
     *
     * Use two nested loops to iterate over each item (i) and each knapsack capacity (w).
     * For each combination of item and capacity, calculate the maximum value that can be obtained:
     * If the weight of the current item (weights[i - 1]) is less than or equal to the current capacity (w),
     * you have a choice:
     * Include the current item: values[i - 1] + dp[i - 1][w - weights[i - 1]]
     * Exclude the current item: dp[i - 1][w]
     * Choose the maximum of the two options.
     * If the weight of the current item exceeds the current capacity, you cannot include it,
     * so the maximum value is the same as the maximum value without including the current item: dp[i - 1][w].
     *
     * After the loops complete, the value stored in dp[n][capacity] represents the maximum value that can be
     * obtained with all the items and the given knapsack capacity.
     */
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

    /**
     * Time Complexity: O(n * capacity), where n is the number of items and capacity is the maximum knapsack capacity
     * Space Complexity: O(n * capacity) due to the 2D array dp that is used to store the solutions to sub problems.
     */
}

