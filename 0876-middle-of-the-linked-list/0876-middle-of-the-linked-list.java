class Solution {
    public ListNode middleNode(ListNode head) {
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
}