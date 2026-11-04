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

class Solution {
    //Time complexity O(N) and space O(H)
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return inOrder(root, k);
    }
    public int inOrder(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        int left = inOrder(root.left, k);
        if (left != -1) {
            return left;
        }
        count++;
        if (count == k) {
            return root.val;
        }
        return inOrder(root.right, k);
    }
}
