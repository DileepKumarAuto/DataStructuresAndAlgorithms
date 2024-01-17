package leetcode.trees;

public class SubTreeOfAnotherTree {

    /**
     * Base Cases:
     * If subRoot is null or the trees rooted at root and subRoot are the same, then subRoot is considered a subtree,
     * and the method returns true.
     * If root is null, the method returns false as there is no match.
     * <p>
     * Recursive Calls:
     * The method recursively checks if the left or right subtrees of the current node in the root tree are the
     * same as the subRoot tree.
     * <p>
     * Helper Method (isSameTree):
     * This method checks if two trees rooted at p and q are the same.
     * It recursively compares the values of nodes and their left and right subtrees.
     */

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null || isSameTree(root, subRoot)) return true;
        if (root == null) return false;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    /**
     * Time Complexity: The time complexity is O(n * m), where n is the number of nodes in the main tree (root) and
     * m is the number of nodes in the subtree (subRoot).
     *
     * Space Complexity: The space complexity is O(h1 + h2), where h1 is the height of the main tree (root) and
     * h2 is the height of the subtree (subRoot).     *
     */
}
