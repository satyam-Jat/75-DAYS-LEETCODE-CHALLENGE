class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int idx=0;
        HashMap<Integer,Integer>map=new HashMap();
        for(int num:nums) {
      if(map.containsKey(num) && Math.abs(map.get(num)-idx)<=k) return true; 
            else map.put(num,idx);
            idx++;
        }

    return false;
    }
}














//O(N2)
/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int mx=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++) {
      if(nums[i]==nums[j]){
       int ans=Math.abs(j-i);
       mx=Math.min(mx,ans);
       if(mx<=k)
       {
        return true;
       }
        }
      }
        }
        return false;
    }
}
*/