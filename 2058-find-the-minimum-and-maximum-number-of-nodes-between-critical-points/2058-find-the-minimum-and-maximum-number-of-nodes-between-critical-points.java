class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left=head; //3 pointers
        ListNode mid=head.next;
        ListNode right=head.next.next;
        int first=-1 , last=-1; //initially both are -1; isme yhi testcase
        int idx=1; //idx chlega
        int[] arr={-1,-1};
        int minDistance=Integer.MAX_VALUE;
        while(right!=null){
            if(mid.val<left.val &&mid.val<right.val || mid.val>left.val &&mid.val>right.val){
                if(first==-1) first=idx; //first to fix hjaega ye loop ek bar hi chlega
                if(last!=-1) { // ek bar last chl chuka hoga tbhi to previous se difference le paega.
                    int dist=idx-last; //find out minimum
                    minDistance=Math.min(minDistance,dist);
                }
                last=idx; //agr last==1 to idx dlega first time 
            }
            idx++;
            left=left.next; //pointers moving
            mid=mid.next;
            right=right.next;
        }
        if(first==last) return arr; //agr ek hi element 
        int maxDistance=last-first; 
        arr[0]=minDistance;//change array
        arr[1]=maxDistance;
        return arr;
    }
}