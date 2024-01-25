package code.math;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    /**
     * Initialize variables rb (row beginning), re (row end), cb (column beginning), and ce (column end) to
     * represent boundaries.
     * Use a while loop to traverse the matrix in a spiral order until the boundaries meet.
     * For each iteration:
     *   Traverse the top row from left to right and add elements to the list.
     *   Increment rb to move to the next row.
     *   Traverse the right column from top to bottom and add elements to the list.
     *   Decrement ce to move to the next column.
     *   Traverse the bottom row from right to left if rb is still less than or equal to re.
     *   Decrement re to move to the next row.
     *   Traverse the left column from bottom to top if cb is still less than or equal to ce.
     *   Increment cb to move to the next column.
     * Return the list containing elements in a spiral order.
     */

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rb = 0;
        int re = matrix.length - 1;
        int cb = 0;
        int ce = matrix[0].length - 1;

        while (rb <= re && cb <= ce) {
            for (int j = cb; j <= ce; j++) {
                list.add(matrix[rb][j]);
            }
            rb++;

            for (int i = rb; i <= re; i++) {
                list.add(matrix[i][ce]);
            }
            ce--;

            if (rb <= re) {
                for (int j = ce; j >= cb; j--) {
                    list.add(matrix[re][j]);
                }
            }
            re--;

            if (cb <= ce) {
                for (int i = re; i >= rb; i--) {
                    list.add(matrix[i][cb]);
                }
            }
            cb++;
        }

        return list;
    }

    /** Time Complexity: O(m * n) where m is the number of rows and n is the number of columns in the matrix.
     * Space Complexity: O(1) Constant space is used as the result list is not considered in the space complexity.
     */
}
