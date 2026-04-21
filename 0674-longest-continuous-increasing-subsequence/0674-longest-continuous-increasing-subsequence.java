class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int mn=1;
        int cnt=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
               
            }
            else 
            {
                mn=Math.max(count,mn);
                count=1;
            }
             
        }
         mn=Math.max(count,mn);
        return mn;
    }
}