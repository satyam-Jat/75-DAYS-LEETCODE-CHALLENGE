/*class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=null; //prevoius pointer point to null(before headC)
        ListNode c=head; //current me head
        ListNode n=null; //head/null  //next
        while(c!=null){
            n=c.next; //these 4 lines are technique of pointers , c ka address le lia taki future me vo connection tode to bhi connect hojae
            c.next=p; //ye pehle chla dia to connection tut jaega c ka ,kyuki ek time pe ek ko hi point krskta to null ko krdia
            p=c;//current age bdhega to prevous se connection tut jaefa islie usme c ko la rhe
            c=n; //pointer age bdate ja rhe current ka
        }
        return p;
    }
    //t.c O(n)
    //s.c=O(1)
}
*/
//pehle recursion se last se 2nd tk reverse krwa lo then , 2nd wala 1st se jod do ,1st wala null se jod do.
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head; //base case
        ListNode a=head.next; // a ka pointer baha rkh dia jaha tk recursion le ayega reverse krke
        ListNode newHead=reverseList(a); //last m hoga bahi nya head recursive function m.
        a.next=head; //changing pointing nodes
        head.next=null;
        return newHead;
    }
}

