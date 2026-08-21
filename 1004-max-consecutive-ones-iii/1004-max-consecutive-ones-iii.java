class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        int maxlen=Integer.MIN_VALUE; int count=0;
        int len=0;
        while(j<n){
                if(nums[j]==0){ //0 count krte jaenge
                   count++;
                }
        while((i<=j) && count>k){ //0 ka count agr limit se bdha to window ko aage se shrink krna chalu bs ye dhyan rkhenge agr shrink me 0 mil rha to count - krenge , brna i++
            if(nums[i]==0){
                count--;
            }
            i++;
            }
            len=j-i+1;
            j++;
        if(maxlen<len){
            maxlen=len;
        } 
     }
         return maxlen;
    }
}












/*
 int n=arr.length,i=0,j=0;
        int z=0; 
        for(int ele:arr){
            if(ele==0) z++;
        }
        if(z==0) return n-1; //agr sare hi 111 hai to 1 to hum ko htana hi tha 
        int zeroes=0,maxlen=0;
        while(i<n && arr[i]==0){
            if(i==n) return 0; //sare hi zero hai to ans bhi 0
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
        if(zeroes==0){return j-i;} //0 1 1 me 1 pe i hai to ek htane ki jarirat hi nhi
            int len=j-i-1; 
              maxlen=Math.max(maxlen,len);
              return maxlen; */