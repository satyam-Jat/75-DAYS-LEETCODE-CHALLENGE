import java.util.*;
//hashset use krne ki glti krra hai kyuki usme duplicates aate hi nhi h.
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                al.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] ans = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            ans[i] = al.get(i);
        }

        return ans;
    }
}