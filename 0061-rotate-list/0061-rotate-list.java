class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      ListNode a=head;
       ListNode b=head;
       ListNode temp=head;
      if(head==null || head.next==null) return head; //initial check
      int len=0; //finding length of ll
      while(temp!=null){
       temp=temp.next;
       len++;
      }
      k%=len; //chota kr rhe same as rotated array
      if(k==0) return head; //agr rotation hi 0 hai to bahi
       for(int i=1;i<=k;i++){
         b=b.next; //jitna need hai utna age bdha do , kyuki phir dono ko saaath me aage bdhana hai ,to hmko distance bhi same milegi dono k beech ki.
       } 
       while(b.next!=null){ 
        a=a.next;
        b=b.next;
       }
       ListNode newHead=a.next; //last 4 line most important to linking , understand by making nodes
       a.next=null;
       b.next=head;
       return newHead;
    }
}