public class SuccessorBST {
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

    TreeNode successor(TreeNode root, TreeNode p){
        TreeNode candidate = null;
        TreeNode cur = root;
        while(cur != null){
            if(cur.val > p.val){
                candidate = cur;
                cur = cur.left;
            }else
                cur = cur.right;
        }
        return candidate;
    }
    
}
