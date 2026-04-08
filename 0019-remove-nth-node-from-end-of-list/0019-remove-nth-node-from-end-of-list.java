class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++; //this loop is only for length count
        }
        if(len==n) return head.next;
        temp=head; //temp me head dal do again ya dusra pounter use krlo traverse krne ke lie
        for(int i=1;i<=len-n-1;i++)
        {
        temp=temp.next;//head ke ek pehle tk jaega brna len-n hona head ka
        }
        temp.next=temp.next.next; //remove nth node
        return head;
    }
}