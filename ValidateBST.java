public class ValidateBST {
    static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int n){
            this.val = n;
        }
    }

    public static void main(String[] args){

    }

    public static boolean validate(TreeNode root){
        return traverse(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean traverse(TreeNode node, int min, int max){
        if(node == null)
            return true;
        if(node.val <= min || node.val >= max)
            return false;
        return traverse(node.left, min, node.val) && traverse(node.right, node.val, max);
    }

    public static boolean isBalanced(TreeNode root){
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    public static int checkHeight(TreeNode node){
        if(node == null)
            return -1;
        int left = checkHeight(node.left);
        if(left == Integer.MIN_VALUE)
            return left;
        int right = checkHeight(node.right);
        if(right == Integer.MIN_VALUE)
            return right;
        if(Math.abs(left - right) > 1)
            return Integer.MIN_VALUE;
        return Math.max(left, right) + 1;
    }
}
