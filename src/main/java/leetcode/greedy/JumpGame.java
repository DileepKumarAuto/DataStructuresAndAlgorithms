package leetcode.greedy;

public class JumpGame {

    /**
     * The canJump method determines whether it is possible to reach the last index of the array
     * starting from the first index using the given jump lengths at each position.
     *
     * @param nums An array representing the maximum jump length from each position.
     * @return true if it is possible to reach the last index, false otherwise.
     */
    public static boolean canJump(int[] nums) {
        /**
         * Initialize the goal to be the last index of the array.
         */
        int goal = nums.length - 1;

        /**
         * Iterate through the array from right to left.
         */
        for (int i = nums.length - 2; i >= 0; i--) {
            /**
             * IIf the current position can reach or go beyond the current goal,
             * update the goal to the current position.
             */

            if (nums[i] + i >= goal) {
                goal = i;
            }
        }

        /**
         * If the goal is 0, it means we can reach the last index from the first index.
         */
        return goal == 0;
    }

    /**
     * Time Complexity:
     * The time complexity of this algorithm is O(n),
     * where n is the length of the input array.
     * The loop iterates through each element in the array once.
     *
     * * Space Complexity:
     * The space complexity is O(1),
     * as the algorithm only uses a constant amount of space for the goal variable and loop index.
     * he space used does not scale with the size of the input array.
     */

}

