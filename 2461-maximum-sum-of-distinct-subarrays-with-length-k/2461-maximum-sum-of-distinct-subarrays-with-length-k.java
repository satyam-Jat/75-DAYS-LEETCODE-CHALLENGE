class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum=0;
        long sum=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); //add element into the map
            sum+=nums[i];
        }
        if(map.size()==k){
            maxSum=sum; //k size window bn gyi to sum dhekhenge kitna hai
        }
        for(int i=k;i<n;i++){
            sum-=nums[i-k]; //minimize sum from delete starting elements
            map.put(nums[i-k],map.get(nums[i-k])-1); //remove frequency by 1

              if(map.get(nums[i-k])==0){ 
                map.remove(nums[i-k]); //remove element from which frequncy i remove before
            }
            sum+=nums[i]; //add new element in sum
             map.put(nums[i],map.getOrDefault(nums[i],0)+1); //add new element in hashmap
            if(map.size()==k){
                maxSum=Math.max(maxSum,sum); //window ke lie jyada element hai to aage chlegi islie upr wale me ni hua kyuki vo fix thi sum hi sumMax hoga
            }
          
        }
        return maxSum;
    }
}






















//n2 tle occur ....
// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         long maxSum=0;
//         int n=nums.length;
//         for(int i=0;i<=n-k;i++){
//              HashSet<Integer>set=new HashSet<>();
//             long sum=0;
//             for(int j=i;j<i+k;j++){
//                 set.add(nums[j]);
//                 sum+=nums[j];
//             }
//             if(set.size()==k){
//                 maxSum=Math.max(sum,maxSum);
//             }
//         }
//         return maxSum;
//     }
// }