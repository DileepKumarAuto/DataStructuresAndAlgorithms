package leetcode.linkedlist;

public class MergeTwoLists {

    /**
     * Create a new ListNode called root to serve as the dummy node for the merged list.
     * Initialize a pointer prev to keep track of the last node in the merged list.
     * Use a while loop to iterate through both lists until either one becomes null.
     * Inside the loop:
     * Compare the current nodes from both lists (list1 and list2).
     * Connect the smaller node to the merged list through the prev pointer.
     * Move the pointer of the list from which the node was taken to its next node.
     * Move the prev pointer to the newly added node in the merged list.
     * After the loop, connect the remaining nodes of the non-empty list (if any) to the merged list.
     * Return the next node of the root, which is the head of the merged sorted list.
     */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final ListNode root = new ListNode();
        ListNode prev = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return root.next;
    }

    /**
     * Time Complexity: O(m + n), where m and n are the lengths of the input lists.
     * Space Complexity: O(1) - constant space is used regardless of the input size.
     * */
}
