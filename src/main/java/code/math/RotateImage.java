package code.math;

public class RotateImage {

    /**
     * Approach:
     * Initialize pointers 'l' (left) and 'r' (right) to represent the boundaries of the matrix.
     * Iterate through the matrix layers using a while loop until 'l' is less than 'r'.
     * For each layer, use a for loop to traverse elements within the layer.
     * Swap elements in a cyclic manner, rotating the four corners of the current layer.
     * Continue the rotation process until the entire matrix is rotated 90 degrees clockwise.
     * Update pointers 'l' and 'r' to move towards the center of the matrix in each iteration.
     */

    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length - 1;

        while ( l < r )
        {
            for(int i = 0; i < r - l; i++)
            {
                int top = l;
                int bottom = r;
                //save the topleft
                int topLeft = matrix[top][l + i];

                //move bottom left into top left
                matrix[top][l + i] = matrix[bottom - i][l];

                // move bottom right into bottom left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // move top right into bottom right
                matrix[bottom][r - i] = matrix[top + i][r];

                // move top left into top right
                matrix[top + i][r] = topLeft;

            }

            r -= 1;
            l += 1;
        }
    }

    /**
     * Time Complexity: O(N^2) : Algorithm involves nested loops, iterating through each element in the matrix once.
     * Space Complexity: O(1) : Constant space is used regardless of the input size, as the rotation is performed in-place.
     */
}
