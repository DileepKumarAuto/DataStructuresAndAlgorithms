package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    /**
     * Initialization:
     * Initialize an empty list of lists res to store the result.
     * Create a queue (LinkedList) to facilitate the breadth-first traversal.
     *
     * Breadth-First Traversal:     *
     * Enqueue the root node if it exists.
     * While the queue is not empty:
     *      Get the current level's size (len) to iterate through the nodes at the current level.
     *      Create a list (level) to store the values of nodes at the current level.
     *      Iterate len times:
     *          Dequeue a node (curr) from the queue.
     *          Add the value of curr to the level list.
     *          Enqueue the left and right children of curr if they exist.
     *
     * Add Level List to Result:
     * After processing all nodes at the current level, add the level list to the result res.
     *
     * Repeat Until Queue is Empty:
     * Continue the process until the queue is empty, ensuring that all levels are processed.
     *
     *  Return Result:
     *  Return the final result res, containing lists of nodes at each level.
     */

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return res;

        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            res.add(level);
        }
        return res;
    }

    /**
     * Time Complexity: O(n), where n is the number of nodes in the binary tree. Each node is processed once.
     * Space Complexity: O(m), where m is the maximum number of nodes at any level.
     * In the worst case, the maximum number of nodes at a level is n/2 (for a perfectly balanced tree).
     * The space complexity is dominated by the queue.
     */
}
