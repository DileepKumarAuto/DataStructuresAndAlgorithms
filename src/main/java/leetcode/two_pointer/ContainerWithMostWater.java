package leetcode.two_pointer;

public class ContainerWithMostWater {

    /**
     * Initialize two pointers, left at the beginning of the array and right at the end of the array.
     *
     * Calculate the area formed by the lines at positions left and right.
     * The width of the container is given by the difference between the indices (right - left),
     * and the height is given by the minimum of the heights at these indices.
     *
     * Update the maximum area (res) if the calculated area is greater than the current maximum.
     *
     * Move the pointer that points to the shorter line (left or right) towards the center.
     * This is because moving the pointer pointing to the taller line won't increase the height,
     * and the only way to potentially increase the area is by moving the pointer pointing to the shorter line.
     *
     * Repeat steps 2-4 until the pointers meet.
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }//test

    /**
     * Time Complexity : (n) where n is the number of elements in the array.
     * Space Complexity : O(1) since the algorithm uses only a constant amount of extra space.
     */
}
