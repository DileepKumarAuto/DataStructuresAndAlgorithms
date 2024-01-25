package code.heap_or_priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Leetcode : 295. Find Median from Data Stream (Hard)
 * https://leetcode.com/problems/find-median-from-data-stream/
 */
public class FindMedianFromDataStream {
    private Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private Queue<Integer> minHeap = new PriorityQueue<>();

    /**
     * The addNum method adds a new number to the data structure while maintaining the balance
     * between the maxHeap (containing the smaller half of the numbers) and minHeap
     * (containing the larger half of the numbers).
     */
    public void addNum(int num) {

        /**
         * If maxHeap is empty or the new number is less than or equal to the current maximum,
         *  add it to the maxHeap; otherwise, add it to the minHeap.
         */
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        /**
         * Ensure that the sizes of maxHeap and minHeap are balanced.
         * If maxHeap has more than one element than minHeap, move the maximum element from
         * maxHeap to minHeap. If minHeap has more elements than maxHeap, move the minimum
         * element from minHeap to maxHeap.
         */

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    /**
     * The findMedian method calculates and returns the median of the numbers
     * stored in the data structure.
     */

    public double findMedian() {
        if (minHeap.size() == maxHeap.size()) {
            // If the sizes of maxHeap and minHeap are equal, return the average of their tops.
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        }
        // If the sizes are not equal, return the top element of maxHeap as it contains the median.
        return (double) maxHeap.peek();
    }

    /**
     * Time Complexity:
     * The addNum method has a time complexity of O(log N)
     * for both adding a number to the heap and balancing the heaps, where N is the total number
     * of elements.
     *
     * The findMedian method has a time complexity of O(1)
     * as it only involves retrieving the tops of the heaps.
     *
     * Space Complexity:
     * The space complexity is O(N)
     * where N is the total number of elements in the heaps,
     * as both maxHeap and minHeap can potentially store all input numbers.
     */

}


