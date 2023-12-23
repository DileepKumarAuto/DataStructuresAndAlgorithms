package leetcode.arrays;

import java.util.*;

public class GroupAnagrams {

    /**
     * Create a HashMap named map, where the keys are sorted strings (representing anagrams),
     * and the values are lists of original strings that are anagrams of each other.
     *
     * Use a for-each loop to iterate through each string (word) in the input list (strs).
     *
     * Convert the current string (word) to a character array.
     * Sort the character array using Arrays.sort(chars) to obtain a sorted representation of the string.
     * Convert the sorted character array back to a string (sortedWord).
     *
     * Check if the sorted string (sortedWord) is already a key in the HashMap (map).
     * If not, create a new entry with the sorted string as the key and an empty list as the value.
     * Add the original string (word) to the list associated with the sorted string key in the HashMap.
     *
     * After processing all strings, the HashMap contains groups of anagrams.
     * Create a new ArrayList containing all the values (lists of anagrams) from the HashMap.
     * Return the list of grouped anagrams.
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
