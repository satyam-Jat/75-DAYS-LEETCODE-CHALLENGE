 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy =new ListNode(100);//create node
    ListNode temp=dummy; //jo dono ke chote wale head ko point kregi
    ListNode temp1=list1; //ye sb pointers hai i 
    ListNode temp2=list2;//j
    while(temp1!=null && temp2!=null){//||(ek hi null hua to exception)
    //AND hai ye agr ek bhi 0 to dono 0;
        if(temp1.val<=temp2.val){ //arr[i]<arr[j]
            temp.next=temp1; //arr[i]=t1;
            temp1=temp1.next; //t1++; act as a node 
        }
        else 
        {
             temp.next=temp2;//otherwise //arr[j]<arr[i]
            temp2=temp2.next; //arr[j]=t2;
        }
        temp=temp.next; //t2++
    }
   if(temp1==null) temp.next=temp2;  //last me temp ko us list me mila denge jisme element jyada hai.
   else temp.next=temp1; 
   return dummy.next;//bahi to head hai
    }
}