public class SecondLargestBST {

    /**
     * The values of a BST should be in ascending order when doing a inOrder traversal,
     * to solve this problem we can traverse the tree in reverse inOrder (right/root/left)
     * so it's in descending order with the help of a count variable.
     * When the count variable == 2 it means that it's the second largest.
     * There is no need to continue the traverse if the count > 2.
     * 
     * Time complexity
     * O(n) --------> n = number of nodes in the tree
     * 
     * Space complexity
     * O(n) --------> n = number of nodes in the tree
     * The memory of the recursion stack
     */
    
    public static class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val){
            this.value = val;
        }
    }

    public static int count = 0;

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        TreeNode r = root.right;
        r.left = new TreeNode(4);
        r.right = new TreeNode(6);
        secondLargest(root);
    }

    public static void secondLargest(TreeNode node){
        if(node == null || count >= 2)
            return;
        secondLargest(node.right);
        count++;
        if(count == 2){
            System.out.println(node.value);
            return;
        }
        secondLargest(node.left);
    }


}
