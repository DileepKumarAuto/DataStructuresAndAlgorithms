package leetcode.arrays;

public class ValidAnagrams {

    /**
     * Check if the lengths of the two strings are equal. If not, return false.
     * Initialize an array store of size 26 to keep track of the frequency of each letter.
     * Iterate through each character in both strings.
     * For each character, increment the count in store for the first string
     * and decrement it for the second string.
     * After the iteration, check if all counts in store are zero.
     * If yes, return true (strings are anagrams); otherwise, return false.
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

    /**
     * Time Complexity: O(N) where n is the length of the input strings s and t.
     * Space Complexity: O(1) as we are using just an array with fixed size.
     */

}
