class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
          nums[i]+=nums[i-1];
        }
        return nums;
    }
}
/*class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        if(n==1) pre[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            pre[0]=nums[0];
            pre[i]=nums[i]+pre[i-1];
        }
        return pre;
    }
}*/