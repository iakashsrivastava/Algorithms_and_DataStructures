//Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class BinaryTree_MaximumDepth {

    public int max;

    public int maxDepth(TreeNode root) {
        getMaxDepth(root,0);
        return max;
    }

    public void getMaxDepth(TreeNode node,int count){
        if(node == null){
            if(count > max)
                max = count;
            return;
        }
        getMaxDepth(node.left,count+1);
        getMaxDepth(node.right,count+1);
    }
}
