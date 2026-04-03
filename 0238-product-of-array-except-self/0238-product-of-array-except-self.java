//can solve brute force , without using / operator
// leftsum*rightsum of ith index. O(n^2)
class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n=nums.length;
         int prefix[]=new int[n];
    int product[]=new int[n];
         int sufix[]=new int[n];
      for(int i=1;i<n;i++){
        
         prefix[0]=1; 
        prefix[i]=prefix[i-1]*nums[i-1];
      }
      for(int i=n-2;i>=0;i--){
     
        sufix[n-1]=1;
        sufix[i]=sufix[i+1]*nums[i+1];
      }
      for(int i=0;i<n;i++)
      {
        product[i]=prefix[i]*sufix[i];
      }
      return product;

    }
}