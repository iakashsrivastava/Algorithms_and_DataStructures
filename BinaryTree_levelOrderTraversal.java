//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        return its level order traversal as:
//        [
//        [3],
//        [9,20],
//        [15,7]
//        ]

public class BinaryTree_levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        addlevelelements(root, levelList, 0);
        return levelList;
    }

    public void addlevelelements(TreeNode node, List<List<Integer>> levelList, int level){
        if(node == null)
            return;
        if(level >= levelList.size())
            levelList.add( new LinkedList<Integer>() );
        levelList.get(level).add(node.val);
        addlevelelements(node.left, levelList, level+1);
        addlevelelements(node.right, levelList, level+1);
    }
}
