package code.linkedlist;

public class ReverseLinkedList {

    /**
     * Initialize three pointers: current, previous, and nextCurrent.
     * Start a while loop that continues until current becomes null.
     * Inside the loop,
     * Save the next node of the current node (nextCurrent) to avoid losing the reference during reversal.
     * Set the next pointer of the current node to point to the previous node, effectively reversing the link.
     * Move the previous pointer to the current node.
     * Move the current pointer to the next node (nextCurrent).
     * Once the loop is completed, the previous pointer will be pointing to the new head of the reversed list.
     * Return the previous node, which is now the head of the reversed linked list.
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextCurrent = null;

        while (current != null) {
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }
        return previous;
    }

    /**
     * Time Complexity: O(n) - where n is the number of nodes in the linked list.
     * Space Complexity: O(1) - constant space is used regardless of the input size.
     * */
}
