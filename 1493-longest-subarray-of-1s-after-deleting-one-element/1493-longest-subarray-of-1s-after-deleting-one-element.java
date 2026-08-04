class Solution {
    public int longestSubarray(int[] arr) {
        int n=arr.length,i=0,j=0;
        int z=0;
        for(int ele:arr){
            if(ele==0) z++;
        }
        if(z==0) return n-1; //agr sare hi 111 hai
        int zeroes=0,maxlen=0;
        while(i<n && arr[i]==0){
            if(i==n) return 0;
            i++;
        }
        j=i;
        while(j<n){
            if(arr[j]==1){
                j++;
            }
            else{
                //arr[j]==0
                if(zeroes==0){
                    j++;
                    zeroes++;
                }
                else{
                    //zeroes==1
                    int len=j-i-1;
                    maxlen=Math.max(maxlen,len);
                    j++;
                    while(i<n && arr[i]==1){
                        i++;
                    }
                    i++;
                }
            }
        }
        if(zeroes==0){return j-i;}
            int len=j-i-1;
              maxlen=Math.max(maxlen,len);
              return maxlen;
    }
}