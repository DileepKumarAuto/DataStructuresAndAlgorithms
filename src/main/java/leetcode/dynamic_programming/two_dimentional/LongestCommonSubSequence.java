package leetcode.dynamic_programming.two_dimentional;

/**
 * Creates a 2D array dp to store the results of sub problems.
 * dp[i][j] will represent the length of the LCS for the substrings text1.substring(0, i) and text2.substring(0, j).
 * <p>
 * The two nested loops iterate over all possible pairs of indices i and j, where i goes from 1 to the length of text1,
 * and j goes from 1 to the length of text2.
 * <p>
 * The code compares characters at the current indices (text1.charAt(i - 1) and text2.charAt(j - 1)).
 * <p>
 * If the characters are equal, it means the current characters contribute to the common subsequence.
 * Therefore, dp[i][j] is set to 1 + dp[i - 1][j - 1], meaning one more character is added to the LCS from the
 * previous lengths of substrings.
 * <p>
 * If the characters are not equal, it means the current characters do not contribute to the common subsequence.
 * In this case, dp[i][j] is set to the maximum of the lengths of LCS without considering the current characters,
 * i.e., Math.max(dp[i - 1][j], dp[i][j - 1]).
 * <p>
 * The final result is stored in dp[text1.length()][text2.length()],
 * representing the length of the LCS for the entire input sequences.
 */
public class LongestCommonSubSequence {
    int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++)

            for (int j = 1; j <= text2.length(); j++)

                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

        return dp[text1.length()][text2.length()];
    }

    /**
     * Time Complexity: O(m * n), where m and n are the lengths of the input strings text1 and text2.
     * Space Complexity: O(m * n), using a 2D array of size (m+1) x (n+1) for dynamic
     */
}
