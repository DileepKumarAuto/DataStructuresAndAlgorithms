package leetcode.dynamic_programming.one_dimentional;

public class LongestIncreasingSubSequence {

    /**
     * Initialize an array T of the same length as the input array nums.
     * This array is used to store the length of the longest increasing subsequence ending at each index.
     *
     * Use two nested loops to iterate over each pair of indices (i, j) in the array.
     * The outer loop represents the main pointer and starts from the second element of the array,
     * while the inner loop represents the second pointer and iterates from the beginning of the array
     * up to the main pointer.
     *
     * Check if the element at index i is greater than the element at index j.
     * If true, it means the element at index i can be included in the increasing subsequence that ends at index j.
     *
     * Update the length of the longest increasing subsequence at index i.
     * If the length of the subsequence ending at index j plus one is greater than the current length at index i,
     * update T[i] with the new length.
     *
     * After the loops, iterate over the T array to find the maximum value and its index.
     *
     * Return the length of the longest increasing subsequence.
     * The result is the length of the longest increasing subsequence,
     * which is the maximum value in the T array plus 1.
     *
     */

    int lengthOfLIS(int[] nums) {

        int[] T = new int[nums.length];

        // Start main pointer
        for (int i = 1; i < nums.length; i++)

            // Start second pointer
            for (int j = 0; j < i; j++)
                if (nums[i] > nums[j])
                    if (T[j] + 1 > T[i])
                        T[i] = T[j] + 1;

        // find the max value
        int maxIndex = 0;
        for (int i = 0; i < T.length; i++)
            if (T[i] > T[maxIndex])
                maxIndex = i;

        return T[maxIndex] + 1;
    }

    /**
     * Time Complexity: O(n^2) where 'n' is the length of the input array nums.
     * Space Complexity: O(n) where 'n' is the length of the input array.
     */
}
