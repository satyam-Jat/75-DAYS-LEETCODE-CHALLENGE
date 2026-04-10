        class Solution {
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
}