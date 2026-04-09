class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp=head;
        // length nikalo
        while(temp != null){
            temp = temp.next;
            len++;
        }

        // kth from start 
        ListNode node1 = head;
        for(int i = 1; i < k; i++){
            node1 = node1.next;
        }

        // kth valfrom end
        ListNode node2 = head;
        for(int i = 1; i <= len - k; i++){
            node2 = node2.next;
        }

        // swap values of nodes
        int t = node1.val;
        node1.val = node2.val;
        node2.val = t;

        return head;
    }
}