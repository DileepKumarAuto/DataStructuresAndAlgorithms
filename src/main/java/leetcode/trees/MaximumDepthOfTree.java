package leetcode.trees;

public class MaximumDepthOfTree {

    /**
     *  Base Case:
     *  If the current node (root) is null, it means there's no node, and the depth is 0.  In this case, return 0.
     *
     * Recursive Case:
     * If the current node is not null, calculate the depth of the left subtree (maxDepth(root.left))
     * and the depth of the right subtree (maxDepth(root.right)).
     *
     * Calculate Maximum Depth: The depth of the current tree is the maximum of the depths of its
     * left and right subtrees, plus 1 (to account for the current node).
     *
     * Return the calculated depth.
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    /**
     * Time Complexity : O(N), where N is the number of nodes in the binary tree.
     * Space Complexity: O(N), where N is the maximum depth of the binary tree.
     */
}
