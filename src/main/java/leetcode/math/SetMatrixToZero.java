package leetcode.math;

public class SetMatrixToZero {

    /**
     * Approach:
     * Use the first row and first column as markers to store information about whether the corresponding row or column
     * should be set to zero.
     * Traverse the matrix and mark the first row and first column based on the presence of zeros.
     * Iterate through the marked matrix and set zeros in the corresponding rows and columns.
     * Handle the special case of the first element (matrix[0][0]).
     */

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRow = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    if (i == 0) {
                        firstRow = true;
                    } else {
                        matrix[i][0] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    /**
     * Time Complexity: O(m * n) where m is the number of rows and n is the number of columns in the matrix.
     * Space Complexity: O(1)Constant space is used as no additional data structures are employed, and the markers
     * are stored in the first row and first column.
     */
}
