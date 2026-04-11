class Solution {
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a=null; //intially pointer apni sahi jgha pr lejana hai to null pr rkh diee
        ListNode b=null;
        ListNode c=null , d=null;
        ListNode temp=head;
        int pos=1;
        while(temp!=null){ //temp ek pointer hai jo initally head pe hai
           if(pos==left-1) a=temp; //agr position left-1 pr pahuchi to a me temp ki value chli jaegi
           if(pos==left) b=temp; //jo bhi node left pe hogi vo b to dedegi
           if(pos==right) c=temp;
           if(pos==right+1) d=temp;
           temp=temp.next; //ye node ke connection ke sath chlri hai
           pos++; //pos ek bs pointer hai 
        }           //seedha mtlb ye hai ye sb krne ka ki listnode direct access ni hoti usme traverse krna hi pdta hai
        if(a!=null) a.next=null; //if wale check boundary ke lie lgaye hai kya pta left and right corner ke hi ho
        if(c!=null) c.next=null;
        reverseList(b);

        if(a!=null) a.next=c;
        if(d!=null) b.next=d;
        if(a==null) return c; //head ka pta nhi hmko konsa hai in aquestions me listnode ke name pr head hi jata hai return me
        return head;
    }
}