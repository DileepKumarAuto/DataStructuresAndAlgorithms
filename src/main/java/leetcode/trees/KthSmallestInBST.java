package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Initialize List: Create an empty list to store the elements during the inorder traversal.
 * <p>
 * Perform Inorder Traversal:
 * Start the inorder traversal of the binary search tree (BST) from the root.
 * Recursively visit the left subtree, then the current node, and finally the right subtree.
 * During traversal, add each node's value to the list.
 * <p>
 * Collect Elements in List:
 * As you traverse the BST, add the value of each visited node to the list.
 * <p>
 * Retrieve kth Smallest:
 * After the traversal is complete, the list contains all elements in ascending order.
 * Return the element at index (k - 1) in the list as the kth smallest element.
 */

public class KthSmallestInBST {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    /**
     * Time Complexity: O(N), where N is the number of nodes in the binary tree, as each node is visited once during the
     * inorder traversal.
     * Space Complexity: O(N) as the list stores the values of all nodes during the traversal.
     */
}
