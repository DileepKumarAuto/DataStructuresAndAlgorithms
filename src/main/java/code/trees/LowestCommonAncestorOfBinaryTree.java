package code.trees;

public class LowestCommonAncestorOfBinaryTree {

    /**
     * Traverse the Binary Search Tree (BST):     *
     * Start from the root of the BST.
     * Compare the values of nodes p and q with the current node's value.
     *
     * Decide the Next Move:     *
     * If both p and q are greater than the current node's value, it means the lowest common ancestor must be on
     * the right subtree. Recur on the right subtree.
     * If both p and q are smaller than the current node's value, it means the lowest common ancestor must be on
     * the left subtree. Recur on the left subtree.
     *
     * Identify the Lowest Common Ancestor:     *
     * If p and q are on different sides of the current node, or one of them is equal to the current node's value,
     * then the current node is the lowest common ancestor. Return the current node.
     *
     * Recursive Calls:     *
     * Continue the recursive calls until the lowest common ancestor is found. The recursion narrows down the search
     * based on the values of p and q.
     */

    public TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q
    ) {
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(
                root.right,
                p,
                q
        );
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(
                root.left,
                p,
                q
        );
        return root;
    }

    /**
     * Time complexity:
     * In the average case (balanced tree), the time complexity is O(log n) where n is the number of nodes.
     * In the worst case (unbalanced tree), the time complexity is O(n) where n is the number of nodes.
     *
     * Space complexity:
     * In the average case (balanced tree), the space complexity is O(log n).
     * In the worst case (unbalanced tree), the space complexity is O(n).
     */
}
