class Solution {
    public void moveZeroes(int[] nums) {
        int m = nums.length;
       // int[] ar=new int[n];
        int j=0;
        for(int i=0;i<m;i++){
            if(nums[i]!=0){
                nums[j]=nums[i]; 
                j++;
            }
        }
            while(j<m){  //jitne bhi bche hai usme 0 dal do
                nums[j]=0;
                j++;
            }
        
        
    }
}