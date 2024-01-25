package code.sorting;

public class BubbleSort {

    /**
     * The method bubbleSort takes an array of integers (arr) as a parameter and sorts it in ascending order
     * using the Bubble Sort algorithm.
     *
     * The outer loop (for (int i = 0; i < n - 1; i++)) iterates over the array elements from the beginning to the
     * second-to-last element. It represents each pass through the array.
     *
     * The inner loop (for (int j = 0; j < n - i - 1; j++)) iterates over the unsorted part of the array.
     * In each iteration, it compares adjacent elements and swaps them if they are in the wrong order.
     *
     * The condition if (arr[j] > arr[j + 1]) checks whether the current element is greater than the next element.
     * If true, it swaps the elements.
     *
     * The swapping is done using a temporary variable (int temp) to exchange the values between arr[j] and arr[j + 1].
     */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Time Complexity: O(n^2) in the worst and average cases
     * Space Complexity: O(1) as it's an in-place sorting algorithm.
     */
}
