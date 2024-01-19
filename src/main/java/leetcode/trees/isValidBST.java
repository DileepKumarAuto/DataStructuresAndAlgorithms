package leetcode.trees;

public class isValidBST {

    /**
     * Base Case:
     * If the current node is null, return true since an empty tree is considered a valid BST.
     * <p>
     * Check Current Node:
     * Check if the current node's value violates the BST property (less than or equal to min or greater than or
     * equal to max). If so, return false.
     * <p>
     * Recursion:
     * Recursively call the dfs method for the left and right subtrees with updated min and max values.
     * For the left subtree, update the max value to the current node's value.
     * For the right subtree, update the min value to the current node's value.
     * <p>
     * Result:
     * If all recursive calls return true (no violations), the binary tree is a valid BST; otherwise, it is not.
     */

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if ((min != null && root.val <= min) || max != null && root.val >= max) {
            return false;
        }
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }

    /**
     * Time Complexity: O(N) - Linear, where N is the number of nodes in the binary tree.
     * Space Complexity: O(H) - Space is proportional to the height of the binary tree.
     * Note: H can vary from O(log N) for balanced trees to O(N) for unbalanced trees.
     */
}
