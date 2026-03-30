class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>al=new ArrayList<>();
         
        for(int j=0;j<nums2.length;j++) {
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==nums2[j]){
                if(al.contains(nums1[i])) continue;
                al.add(nums1[i]);
            }
        } 
        }
       int[] ans = new int[al.size()];
        for(int k = 0; k < al.size(); k++) {
            ans[k] = al.get(k);
        }

     return ans;
    }
}