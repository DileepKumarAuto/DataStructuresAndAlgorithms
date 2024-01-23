package leetcode.arrays;

public class ProductOfArrayExceptSelf {

    /**
     * Initialize Result Array:
     * Create an array arr of the same length as the input nums array to store the result.
     *
     * Left Product Accumulation:
     * Initialize a variable left to 1. Iterate through the nums array from left to right.
     * At each index i, set arr[i] to the current value of left and update left by multiplying it with nums[i].
     * This ensures that arr[i] contains the product of all elements to the left of nums[i].
     *
     * Right Product Accumulation:
     * Initialize a variable right to 1. Iterate through the nums array from right to left.
     * At each index i, multiply arr[i] with the current value of right and update right by multiplying it with nums[i].
     * This step completes the product calculation by incorporating the product of elements to the right of nums[i].
     *
     * Return Result Array:
     * The arr array now contains the product of all elements except for the one at the corresponding index
     * in the original nums array.
     */
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    /**
     *  Time complexity of O(n), where 'n' is the length of the input array, as it makes two passes through the array.
     *  Space complexity is O(1) since the result array is not counted towards additional space usage.
     */
}
