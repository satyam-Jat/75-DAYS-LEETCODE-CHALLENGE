class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        if(head==null) return head;
        while(b!=null){
        if(a.val==b.val){ //2 pointer approach
           b=b.next;
        }
        else{
        a.next=b; 
        a=b;
        }
    }
    a.next=b; //final wala duplicate hi reh jaega , do dry run
    return head;
    }
}