package leetcode.sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * Initialize an empty list substringL to store the characters of the current substring without repeating characters.
 * Initialize largestlength to 0 to keep track of the length of the longest substring.
 *
 * Use a for loop to iterate through each character in the input string s.
 * The loop variable right represents the right boundary of the current substring.
 *
 * Check if the current character (s.charAt(right)) is already present in the substringL list.
 *
 * If a repeating character is found:
 * Find the index of the first occurrence of the repeating character in the substringL.
 * Remove the repeating character from the substringL.
 * If the index is greater than 0, clear all characters before that index in the substringL.
 * Update the substring:
 *
 * Add the current character (s.charAt(right)) to the substringL. This represents expanding the window.
 *
 * Update largestlength with the maximum value between its current value and the size of the current substringL.
 * This ensures that it always stores the length of the longest substring.
 *
 * Continue the loop until all characters in the string have been processed.
 *
 * After the loop completes, return the final value of largestlength, which represents the length of the
 * longest substring without repeating characters.
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++) {
            if(substringL.contains(s.charAt(right))) {
                // get the index of the char
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if(index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;
    }
}
