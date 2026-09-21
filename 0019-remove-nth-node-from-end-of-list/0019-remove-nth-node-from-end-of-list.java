/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
       
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        if(len==n){
            head=head.next;
            return head;
        }
        int x=len-n;
        for(int i=1;i<x;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}