package leetcode.dynamic_programming.one_dimentional;

import java.util.List;

public class WordBreak {

    /**
     * dp is a boolean array of size inputWordLength + 1 used for dynamic programming.
     * It represents whether a substring of the input word can be broken down into words from the dictionary.
     * Initially, the last element of dp is set to true because an empty string is always breakable.
     *
     * The code uses a nested loop to iterate through the characters of the input word in reverse order.
     * The outer loop iterates over the characters of the input word.
     * The inner loop iterates over each word in the dictionary.
     *
     * For each word in the dictionary, the code checks if the substring of the input word starting from charIndex
     * matches the current dictionary word (inputWord.startsWith(w, charIndex)).
     * If there is a match and the length of the substring is within bounds, it updates the dynamic programming array.
     * The idea is that if the substring from the current index is breakable,
     * then the entire substring from the current index is also breakable.
     *
     * If dp[charIndex] becomes true (meaning the current substring is breakable), the inner loop is broken
     *
     * The method returns the value of dp[0], indicating whether the entire input word (starting from index 0)
     * can be broken down into words from the dictionary.
     */

    public boolean wordBreak(String inputWord, List<String> wordDictionary) {
        int inputWordLength = inputWord.length();
        boolean[] dp = new boolean[inputWordLength + 1];
        dp[inputWordLength] = true;

        for (int charIndex = inputWordLength - 1; charIndex >= 0; charIndex--) {
            for (String w : wordDictionary) {
                if ((charIndex + w.length()) <= inputWordLength &&
                        inputWord.startsWith(w, charIndex)) {
                    dp[charIndex] = dp[charIndex + w.length()];
                }
                if (dp[charIndex]) {
                    break;
                }
            }
        }
        return dp[0];
    }

    /**
     * Time Complexity: O(N * M) where N is the length of the input word and M is size of dictionary
     * Space Complexity: O(N) where N is the length of the input word.
     */
}
