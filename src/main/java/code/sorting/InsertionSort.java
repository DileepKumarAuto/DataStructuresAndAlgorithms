package code.sorting;

public class InsertionSort {

    /**
     * Initialization:
     * Start with the second element of the array (index 1) as the first element is considered already sorted.
     * Iterate through the unsorted part of the array, comparing each element with the elements in the sorted sublist.
     *
     * Insertion:
     * For each element in the unsorted part, compare it with the elements in the sorted sublist from right to left.
     * Shift larger elements one position to the right until finding the correct position for insertion.
     * Insert the current element into its correct position in the sorted sublist.
     */

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Time complexity : O(n^2)  where n is the number of elements in the array.
     * Space Complexity: O(1) because insertion sort only requires a constant amount of additional memory space for
     * variables like indices and temporary variables.
     *
     */
}
