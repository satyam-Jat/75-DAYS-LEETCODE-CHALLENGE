class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result =new ArrayList<>();
     int n =nums.length;
     if(nums.length < 3) return result;
     Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target=-nums[i];
            int low=i+1;
            int high=n-1;
            while(low<high)

        {
            int sum=nums[low]+nums[high];
            if(sum==target){
                result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                while(low<high && nums[low]==nums[low+1]) low++;
                while(low<high && nums[high]==nums[high-1]) high--;
                low++;
                high--;
            }
            else if (sum<target){
                low++;
            }
            else {
                high--;
            }
        }
        }
       return result;
    }
}
