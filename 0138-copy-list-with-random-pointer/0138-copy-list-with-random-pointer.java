//hard category question //tc =0n //sc=0n
class Solution {
    public Node deepCopy(Node head){ //random connection ke lie deep copy bnani hi pdti hai taki hm uske hi nodes ko point kr ske
        Node head2 = new Node(head.val); 
        Node t1=head.next;
        Node t2=head2;
        while(t1!=null){
            Node temp=new Node(t1.val);
            t2.next=temp;
            t2=t2.next;
            t1=t1.next;
    }
    return head2;
}
public void connectAlternatively(Node head,Node head2){
    Node t1=head;
    Node t2=head2;
    Node dummy=new Node(-1);
    Node t=dummy;
    while(t1!=null && t2!=null){
        t.next = t1;
        t1=t1.next;
        t=t.next;
        t.next=t2;
        t2=t2.next;
        t=t.next;
    }
}
public void assignRandom(Node head,Node head2){
   Node t1=head;
   Node t2=head2;
   while(t1!=null){
    t2=t1.next;
    if(t1.random!=null) t2.random=t1.random.next; //technique to direct jump to req node
    t1=t1.next.next;
   }

}
public void split(Node head,Node head2){ //use alternate connection to create link in nodes linearly
    Node t1=head;
    Node t2=head2;
    while(t1!=null){
        t1.next=t2.next;
        t1=t1.next;
        if(t1==null) break;
        t2.next=t1.next;
        t2=t2.next;
        }
    }
    public Node copyRandomList(Node head){
        if(head==null) return null; //if null then ...
        //step 1 - create deep copy
        Node head2=deepCopy(head);
        //s2- join head and head2 alternatively
        connectAlternatively(head,head2);
        // s3- assign random pointers
        assignRandom(head,head2);
        //s4- split the linked list;
        split(head,head2);
        return head2;
    }
}
 