package code.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    /**
     * Use a HashSet 'uniques' to track unique elements encountered during iteration.
     * If the current element is already in 'uniques,' it indicates a duplicate, and the method returns true.
     * Otherwise, it adds the element to 'uniques.'
     * If no duplicates are found, the method returns false.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (uniques.contains(num)) {
                return true;
            }
            uniques.add(num);
        }
        return false;
    }

    /**
     * Time Complexity: O(N) where N is the length of input array
     * Space Complexity: O(N) where N is the length of input array
     */
}
