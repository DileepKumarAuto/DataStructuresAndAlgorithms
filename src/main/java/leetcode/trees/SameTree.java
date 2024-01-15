package leetcode.trees;

public class SameTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    /**
     * Base Cases:
     * If both nodes (p and q) are null, they are the same (return true).
     * If one node is null and the other is not, they are different (return false).
     *
     * Node Value Comparison:
     * Check if the values of the current nodes (p.val and q.val) are equal.
     * If not, the trees are different (return false).
     *
     * Recursive Comparison:
     * Recursively compare the left subtrees (dfs(p.left, q.left)) and the right subtrees (dfs(p.right, q.right)).
     *
     * Result:
     * Return true only if both left and right subtrees are the same.
     *
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    private boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) return false;

        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);

        return left && right;
    }

    /**
     * Time Complexity: O(N) where N is the number of nodes in the larger tree.
     * Space Complexity: O(N) where N is the maximum depth of the larger tree (recursion stack space).
     */
}
