class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int mx=-2;
        int x=0;
        int ans=0;
        int sum=0;
       for(int i=0;i<k;i++){
        sum+=arr[i];
       }
        int avg=sum/k;
       if (avg >= threshold) {
       ans++;
}
        
        for(int i=k;i<n;i++){
        sum-=arr[x++];
        sum+=arr[i];
        mx=Math.max(avg,mx);
        avg=sum/k;
        if(avg>=threshold){
            ans++;
        }
        }
        
        return ans;
    
    }
}