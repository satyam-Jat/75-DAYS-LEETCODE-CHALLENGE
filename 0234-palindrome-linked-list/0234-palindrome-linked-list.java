       /* class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode temp = head;
        List<Integer> al = new ArrayList<>();

        while(temp != null){
            al.add(temp.val);
            temp = temp.next; // list ko array me covert thenn booleanwe
        }

        int i = 0;
        int j = al.size() - 1;

        while(i < j){
            if(!al.get(i).equals(al.get(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
} */
//2nd method - nyi linked list(deep copy) bnao jisme node to nyi hogi bs value purane wali hogi , usko reverse function me dalkr then check dono same hai ya nahi.
//3rd method
 class Solution {
 public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head; //base case
        ListNode a=head.next; // a ka pointer baha rkh dia jaha tk recursion le ayega reverse krke
        ListNode newHead=reverseList(a); //last m hoga bahi nya head recursive function m.
        a.next=head; //changing pointing nodes
        head.next=null;
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       
        ListNode i=head;
        ListNode j=reverseList(slow);
        while(j!=null)
        {
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
 }