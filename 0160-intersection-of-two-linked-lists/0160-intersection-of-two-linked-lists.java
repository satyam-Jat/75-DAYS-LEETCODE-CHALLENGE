public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        int len1=0;
        
        while(t1!=null){
            t1=t1.next;
            len1++;
        }
        int len2=0;
          ListNode t2=headB;
            while(t2!=null){
            t2=t2.next;
            len2++;
            
        }
        t1=headA;
            t2=headB;
        if(len1>len2){
            for(int i=1;i<=len1-len2;i++){
                 t1=t1.next;
            }
        }
        else 
        {
             for(int i=1;i<=len2-len1;i++){
              t2=t2.next; }
        }
        
      while(t1!=t2){
          t1=t1.next;
          t2=t2.next;  
        }
        return t1;
    }
}
