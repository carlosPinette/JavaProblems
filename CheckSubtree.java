public class CheckSubtree {
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

    public static boolean isSubTree(TreeNode p, TreeNode q){
        if(q == null)
            return true;
        return checkSubTree(p, q);
    }

    public static boolean checkSubTree(TreeNode p, TreeNode q){
        if(p == null)
            return false;
        if(p.val == q.val && matchTree(p, q))
            return true;
        return checkSubTree(p.left, q) || checkSubTree(p.right, q);
    }

    public static boolean matchTree(TreeNode p, TreeNode q){
        if(p == null && q == null)
            return true;
        if(p == null || q == null) 
            return false;
        if(p.val != q.val)
            return false;
        return matchTree(p.left, q.left) && matchTree(p.right, q.right);
    }
    
}
