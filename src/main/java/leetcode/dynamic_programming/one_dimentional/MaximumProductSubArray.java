package leetcode.dynamic_programming.one_dimentional;

public class MaximumProductSubArray {

    /**
     * Initialize variables leftProduct, rightProduct, and ans.
     * leftProduct and rightProduct are used to keep track of the product of elements
     * encountered so far from the left and right sides, respectively.
     * Initialize ans with the first element of the array (nums[0]).
     *
     * Use a for loop to iterate through the elements of the array.
     *
     * If either leftProduct or rightProduct becomes zero, update it to 1.
     * This step is crucial for handling zero values in the array because any subarray
     * containing zero will have a product of zero.
     * Calculate the prefix product by multiplying the current element with leftProduct.
     * Calculate the suffix product by multiplying the corresponding element from the end of the array with rightProduct.
     * Update the ans with the maximum value among ans, leftProduct, and rightProduct.
     *
     * After the loop completes, ans contains the maximum product of a subarray in the array,
     * and the function returns this value.
     */
    int maxProduct(int[] nums) {

        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {

            //if any of leftProduct or rightProduct become 0 then update it to 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            //prefix product
            leftProduct *= nums[i];

            //suffix product
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return ans;
    }

    /**
     * Time complexity : O(N) where n is the length of the input array
     * Space complexity :  O(N) where n is the length of the input array
     */
}
