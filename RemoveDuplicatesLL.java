public class RemoveDuplicatesLL {
    
    public class ListNode{
        int val;
        ListNode next = null;
        public ListNode(){
            this.val = 0;
        }
        public ListNode(int n){
            this.val = n;
        }
    }
    public static void main(String[] args){

    }

    public static ListNode removeDuplicates(ListNode root){
        if(root == null)
            return null;
        ListNode cur = root;
        ListNode prev = root;
        while(cur != null){
            if(cur.val != prev.val){
                prev.next = cur;
                prev = cur;
            }
            cur = cur.next;
        }
        prev.next = null;
        return root;
    }
}
