package code.dynamic_programming.one_dimentional;

public class PalindromicSubstrings {


    /**
     * Initialize a variable result to store the count of palindromic substrings. Set it to 0 initially.
     *
     * Iterate through each character in the string using the variable i as the center of the potential palindrome.
     * For each i, there are two cases to consider: one where the palindrome length is odd, and another where it is even.
     *
     * Initialize two pointers, left and right, both set to i.
     * Expand the pointers outward (to the left and right) while the characters at left and right are equal.
     * Increment the result for each palindrome found in this way.
     *
     * Initialize left to i and right to i + 1. Similar to the odd-length case,
     * expand the pointers outward while the characters at left and right are equal.
     * Increment the result for each palindrome found in this way.
     *
     * After both cases are considered for each character in the string,
     * return the final count of palindromic substrings.
     */
    public int countSubstrings(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            // Odd Length
            int left = i, right = i;
            while (
                    left >= 0 &&
                            right < s.length() &&
                            s.charAt(left) == s.charAt(right)
            ) {
                result++;
                left--;
                right++;
            }
            // Even Length
            left = i;
            right = i + 1;
            while (
                    left >= 0 &&
                            right < s.length() &&
                            s.charAt(left) == s.charAt(right)
            ) {
                result++;
                left--;
                right++;
            }
        }
        return result;
    }

    /**
     * Time Complexity:  O(n^2), where n is the length of the input string s.
     * Space Complexity :  O(1)
     */
}
