public class MinDistanceBST {
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
    
    int min = Integer.MAX_VALUE;
    Integer pre = null;

    public int minDistance(TreeNode root){
        if(root == null){
            return 0;
        }
        dfs(root);
        return min;
    }

    public void dfs(TreeNode node){
        if(node == null)
            return;
        dfs(node.left);
        if(pre != null){
            min = Math.min(min, node.val - pre);
        }
        pre = node.val;
        dfs(node.right);
    }

}
