public class SumLists {
    static class ListNode{
        int val = 0;
        ListNode next = null;
        public ListNode(int n){
            this.val = n;
        }
    }

    public static void main(String[] args){

    }

    public static ListNode sum(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0){
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        return result.next;
    }
}
