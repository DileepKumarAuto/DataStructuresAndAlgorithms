package leetcode.linkedlist;

public class LinkedListCycle {

    /**
     * Initialize two pointers, fast and slow, both initially pointing to the head of the linked list.
     * Move the fast pointer two steps at a time and the slow pointer one step at a time.
     * If there is a cycle in the linked list, the fast pointer will eventually catch up to the slow pointer.
     * Check for the equality of the fast and slow pointers at each step.
     * If they meet, there is a cycle, and the method returns true.
     * If the fast pointer reaches the end of the list (null), there is no cycle, and the method returns false.
     * */
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    /** Time Complexity: O(n) The algorithm traverses the linked list once.
     *  Space Complexity: O(1) : Constant space is used regardless of the input size, as only two pointers
     *  (fast and slow) are utilized.
     */
}
