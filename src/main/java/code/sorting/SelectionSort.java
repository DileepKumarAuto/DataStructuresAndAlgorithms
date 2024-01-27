package code.sorting;

public class SelectionSort {

    /**
     * Initialization:
     * Start with the entire array as the unsorted part.
     * Initialize an outer loop to iterate over the unsorted part from the first element to the second-to-last element.
     *
     * Find Minimum Element:
     * Inside the outer loop, initialize a variable minIndex to the current index of the outer loop (i).
     * Start an inner loop from i+1 to the end of the array.
     * In the inner loop, compare each element with the element at minIndex. If the current element is smaller,
     * update minIndex with the current index.
     *
     * Swap Minimum Element:
     * After finding the minimum element in the unsorted part, swap it with the first element in the unsorted part.
     * The first element in the unsorted part is at index i.
     *
     * Repeat:
     * Move the boundary between the sorted and unsorted parts one element to the right by incrementing the outer
     * loop index (i).
     * Repeat steps 2 and 3 until the entire array is sorted.
     */

   public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Time Complexity: O(n^2) - Selection sort has a quadratic time complexity, making it inefficient
     * for large datasets.
     * Space Complexity: O(1) - Selection sort operates in-place and requires a constant amount of additional m
     * emory for temporary variables, making its space complexity constant.
     */
}
