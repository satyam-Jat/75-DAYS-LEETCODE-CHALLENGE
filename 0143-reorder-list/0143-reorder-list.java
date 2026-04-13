class Solution {
     public ListNode reverseList(ListNode head) { //copypaste
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
    public ListNode MiddleNode(ListNode head) { //copypaste
        ListNode temp = head; //initially head ko temp me dalenge.
        int len=0;
        while(temp!=null){ //jb tk pointer null/last wale node tk nahi pahuch jata
            temp=temp.next;
            len++; 
        }
        int mid=len/2+1; //mid ke lie alg se loop ni chlaya usi se n size tk mid value nikl gyi
        temp=head; // ya to temp2 nya pointer bnao usme head store krke chlao ya isi ko again daldo
        for(int i=1;i<=mid-1;i++){ //replace with next one
            temp=temp.next;
    }
    return temp;
}

    public void reorderList(ListNode head) {
        ListNode LeftMiddle=MiddleNode(head); //2 tukdo me todni hai na
        ListNode head2=LeftMiddle.next; //2nd half
        LeftMiddle.next=null; //connection brreak
        head2=reverseList(head2); //2nd wale park ko reverse kyuki 1st ko 1st se hi mila skte na ki last se
        ListNode dummy=new ListNode(-1); //create dummy node jo dono ke elements bari bari lengi 
        ListNode temp=dummy; //temp pointer hai jo chlega
        while(head!=null && head2!=null){
            temp.next=head; //dummy connect initallty to head
            head=head.next; //head move on one step
            temp=temp.next;//temp pointer move on one step
            
            temp.next=head2;
             head2=head2.next;
            temp=temp.next;
           
        }
        if(head==null) temp.next=head2; //if loop break because of head null then it connect to head2 node 
        if(head2==null) temp.next=head;
        head=dummy.next; //dummy ka next hi to head hoga
    }
}