//Given a binary tree, determine if it is height-balanced.
//
// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two
// subtrees of every node never differ by more than 1.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (depth(root,0) == Integer.MAX_VALUE) return false;
        else return true;
    }

    public int depth(TreeNode node, int depth){

        if(node == null)
            return depth;

        int ldepth = depth(node.left,depth+1);
        int rdepth = depth(node.right,depth+1);

        if(Math.abs(ldepth-rdepth) >1)
            return Integer.MAX_VALUE;

        int maxDepth = Math.max(ldepth,rdepth);
        return maxDepth;

    }

}
