package leetcode.trees;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreOrderAndInorder {

    /**
     * Base Case Check:
     * If either the preorder array or the inorder array is empty, return null since there are no elements to
     * construct the tree.
     * <p>
     * Create Root Node:
     * Create a TreeNode named root with the value of the first element from the preorder array (preorder[0]).
     * <p>
     * Find Root Position in Inorder:
     * Iterate through the inorder array to find the index (mid) where the value of the root node matches (preorder[0]).
     * <p>
     * Construct Left Subtree:
     * Recursively call buildTree with the left subtree's preorder and inorder arrays.
     * preorder for the left subtree is obtained by copying elements from index 1 to mid + 1.
     * inorder for the left subtree is obtained by copying elements from index 0 to mid.
     * <p>
     * Construct Right Subtree:
     * Recursively call buildTree with the right subtree's preorder and inorder arrays.
     * preorder for the right subtree is obtained by copying elements from index mid + 1 to the end.
     * inorder for the right subtree is obtained by copying elements from index mid + 1 to the end.
     * <p>
     * Return Root Node:
     * Return the constructed root node.
     */

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        int mid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) mid = i;
        }

        root.left =
                buildTree(
                        Arrays.copyOfRange(preorder, 1, mid + 1),
                        Arrays.copyOfRange(inorder, 0, mid)
                );
        root.right =
                buildTree(
                        Arrays.copyOfRange(preorder, mid + 1, preorder.length),
                        Arrays.copyOfRange(inorder, mid + 1, inorder.length)
                );

        return root;
    }

    /**
     *Time Complexity: O(n^2) - In the worst case, each recursive call involves copying arrays,
     * leading to quadratic time complexity.
     * Space Complexity: O(n) - The space complexity is dominated by the recursive call stack,
     * which can go as deep as the number of nodes in the tree.
     */
}
