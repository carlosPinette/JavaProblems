public class PartitionList {
    static class ListNode{
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

    public static ListNode partition(ListNode head, int n){
        ListNode smallerHead = new ListNode();
        ListNode biggerHead = new ListNode();
        ListNode small = smallerHead;
        ListNode big = biggerHead;
        while(head != null){
            if(head.val < n){
                small.next = head;
                small = small.next;
            }else{
                big.next = head;
                big = big.next;
            }
            head = head.next; 
        }
        small.next = biggerHead.next;
        return smallerHead.next;
    }
}
