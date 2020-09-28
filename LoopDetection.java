public class LoopDetection {
    static class ListNode{
        int val = 0;
        ListNode next = null;
        public ListNode(int n){
            this.val = n;
        }
    }

    public static void main(String[] args){

    }

    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
