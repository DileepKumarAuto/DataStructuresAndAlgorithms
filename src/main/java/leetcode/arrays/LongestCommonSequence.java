package leetcode.arrays;

import java.util.HashSet;


/**
 * Check Empty Array:
 * If the input array nums is empty, return 0 as there are no consecutive elements.
 *
 * HashSet for Quick Lookup:
 * Create a HashSet hs and add all elements from the nums array to it. This allows for constant-time lookups
 * to check for the existence of numbers.
 *
 * Iterate Through Elements:
 * Initialize the variable longest to 1, representing the length of the longest consecutive sequence.
 *
 * Identify Start of Sequences:
 * For each number num in the nums array:
 * Check if num-1 is not present in the HashSet (hs). If not present, it indicates the start of a sequence.
 * Initialize a counter count to 1 and enter a while loop to check for consecutive numbers (num+1) in the HashSet.
 * Increment num and count until there are no more consecutive numbers.
 * Update the longest variable with the maximum of its current value and the calculated count.
 *
 * Optimization and Early Exit:
 * Check if longest has already exceeded half the length of the nums array. If so, break out of the loop early,
 * as finding a longer sequence is not possible.
 *
 * Return Longest Length:
 * Return the final value of the longest variable.
 */
public class LongestCommonSequence {
    public int longestConsecutiveSequence(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums) hs.add(num);
        int longest =1;
        for(int num: nums ){
            //check if the num is the start of a sequence by checking if left exists
            if(!hs.contains(num-1)){ // start of a sequence
                int count =1;
                while(hs.contains(num + 1)){ // check if hs contains next no.
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);

            }
            if(longest > nums.length/2) break;

        }
        return longest;
    }

    /**
     *  Time complexity of the algorithm is O(n), where 'n' is the number of elements in the input array,
     *  as each element is processed once.
     *  Space complexity is O(n) due to the HashSet.
     */
}
