package leetcode.trees;

public class InvertTree {

    /**
     * Base Case:  If the root of the tree is null, return null, as there is no subtree to invert.
     *
     * Create a new TreeNode named node with the same value as the original root.
     * Invert Left and Right Subtrees:
     * Recursively invert the left subtree of the original root and assign it to the right child of the new node.
     * Recursively invert the right subtree of the original root and assign it to the left child of the new node.
     *
     * Return the node as the root of the inverted subtree.
     */

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.right = invertTree(root.left);
        node.left = invertTree(root.right);
        return node;
    }

    /**
     * Time complexity:  O(n), where n is the number of nodes in the tree, as each node is visited once.
     * Space complexity is O(h), where h is the height of the tree.
     * This represents the maximum height of the recursive call stack.
     */
}
