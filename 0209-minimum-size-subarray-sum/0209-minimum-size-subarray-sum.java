class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0;
        int n=nums.length;
        int minLen=Integer.MAX_VALUE;
        while(j<n && sum<target){
            sum+=nums[j];
            j++;
        }
        j--;
       while(i<n && j<n){
        int len=j-i+1;
        if(sum>=target) minLen=Math.min(minLen,len);
        sum-=nums[i];
        i++; j++;
        while(j<n && sum<target){
            sum+=nums[j++];
        }
        j--;
       }
       if(minLen==Integer.MAX_VALUE){
        return 0;
       }
       return minLen;
    }
}
















// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int n=nums.length;
//         int mn=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0,j=i;
//             while(j<n && sum<target){
//                 sum+=nums[j++];
//             }
//             j--;
//             int len=j-i+1;
//           if(sum>=target){
//             mn=Math.min(len,mn);
//           }
//               if(mn==Integer.MAX_VALUE) return 0;
//         }
//         return mn;
//     }
// }