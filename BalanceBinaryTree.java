public class BalanceBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int n){
            val = n;
        }
    }

    public static void main(String[] args){

    }

    public static boolean isBalanced(TreeNode root){
        if(root == null)
            return true;
        int diff = Math.abs(getHeight(root.left) - getHeight(root.right));
        return diff > 1 ? false : true;
    }

    public static int getHeight(TreeNode node){
        if(node == null)
            return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
