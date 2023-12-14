package leetcode.dynamic_programming.one_dimentional;

public class DecodeWays {

    /**
     * Initialize an array dp of size s.length() + 1 to store the number of ways to decode substrings of  given string.
     * dp[i] will represent the number of ways to decode the first i characters of the string.
     *
     * Set dp[0] = 1 because there is one way to decode an empty string (no characters).
     *
     * Set dp[1] based on the first character of the input string s.
     * If the first character is '0', there is no valid decoding, so set dp[1] = 0.
     * Otherwise, set dp[1] = 1 because there is only one way to decode a single-digit number.
     *
     * Iterate from i = 2 to s.length():
     *
     * a. If the current character at position i - 1 is not '0', update dp[i] by adding dp[i - 1].
     * This is because the current digit can be decoded individually.
     *
     * b. Check if the two consecutive digits at positions i - 2 and i - 1 can form a valid letter.
     * If so, update dp[i] by adding dp[i - 2].
     * The conditions for a valid letter are either the current two digits forming a number in the range '10' to '26'
     * or the first digit being '1'.
     *
     * Finally, return dp[s.length()], which represents the total number of ways to decode the entire input string.
     *
     */
    public int numDecoding(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1; // empty string
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i < s.length() + 1; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            if (
                    s.charAt(i - 2) == '1' ||
                            (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7')
            ) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }

    /**
     * Time Complexity: O(n) where n is the length of the input string
     * Space Complexity: O(n) where n is the length of the dp array
     */
}
