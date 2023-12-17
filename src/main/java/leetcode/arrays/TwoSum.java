package leetcode.arrays;

import java.util.HashMap;

public class TwoSum {

    /**
     *  Iterate through the array,
     *  calculate the difference between the target value and the current element,
     *  and check if this difference is present in the HashMap.
     *
     *  If found, it returns the indices of the two elements.
     *  If not found, it adds the current element and its index to the HashMap.
     *  If no solution is found after iterating through the array, it returns an empty array.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }

    /**
     * Time Complexity: O(N) where N is the length of input array
     * Space Complexity: O(N) where N is the length of input array
     */

}
