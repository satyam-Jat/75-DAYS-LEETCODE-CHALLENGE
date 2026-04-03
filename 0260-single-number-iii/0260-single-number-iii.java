class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        int b1=0; int b2=0;
       for(int i=0;i<n;i++){
        xor=xor^nums[i];
       }
       int rbit=(xor&(xor-1));
       int mask=rbit^xor;
       for(int i=0;i<n;i++){
        if((mask & nums[i])==0) 
        b1^=nums[i];
        else 
        b2^=nums[i];
       }
       int arr[]={b1,b2};
       return arr;
    }
}