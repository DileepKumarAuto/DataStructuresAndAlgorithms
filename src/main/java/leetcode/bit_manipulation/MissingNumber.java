package leetcode.bit_manipulation;

public class MissingNumber {

    /**
     * Calculate the expected sum of the series from 0 to n using the formula n * (n + 1) / 2.
     * Compute the actual sum of the given array.
     * The difference between the expected sum and the actual sum is the missing number.
     */

    public int missingNumber(int[] nums) {
        int sum = 0;
        int total = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }

    /**
     * Time Complexity: O(n)  The algorithm iterates through the array once to calculate the sum.
     * Space Complexity: O(1) Constant space is used regardless of the input size.
     * */

}
