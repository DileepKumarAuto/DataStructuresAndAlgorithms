package code.linkedlist;

public class RemoveNthNodeFromEnd {

    /**
     * Create a dummy node 'temp' and set its next to the head of the linked list to handle edge cases.
     * Initialize two pointers, 'first' and 'second,' both pointing to the dummy node.
     * Move the 'second' pointer n nodes ahead.
     * Move both 'first' and 'second' pointers until 'second' reaches the end of the linked list.
     * 'first' will be pointing to the node before the one to be removed.
     * Adjust the next reference of 'first' to skip the node to be removed.
     * Return the modified linked list starting from temp.next.
     *  */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp, second = temp;

        while (n > 0) {
            second = second.next;
            n--;
        }

        while (second.next != null) {
            second = second.next;
            first = first.next;
        }

        first.next = first.next.next;
        return temp.next;
    }

    /**
     * Time Complexity: O(n) The algorithm traverses the linked list twice,
     * with the 'second' pointer moving n steps and then reaching the end.
     *
     * Space Complexity: O(1) Constant space is used regardless of the input size, as only
     * two pointers ('first' and 'second') and a dummy node are utilized.
     */

}
