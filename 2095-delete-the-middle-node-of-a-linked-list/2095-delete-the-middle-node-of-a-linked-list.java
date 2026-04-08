class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if(head==null || head.next==null) return null; // edge case , ek hoga ya kuch nhi hoga to null hi aega kyuki delete hojaega.

         ListNode slow=head; 
         ListNode fast=head;
         ListNode prev=null;
         while(fast!=null && fast.next!=null){
         prev=slow; //ek km , direct ek km ka koi connection nhi islie traverse se hi ek kam chlenge.
         slow=slow.next;//X1
         fast=fast.next.next; //X2
         }
        prev.next=slow.next; //delete the middle node 
        return head;
         }
    }