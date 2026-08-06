class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int i=0; int j=k-1; int len=0; int maxlen=-1; int satisfied=0; int a=i,b=j;
        int n=arr.length;
        for(int x=i;x<=j;x++){
            if(grumpy[x]==1) len+=arr[x];
        }
      
        while(j<n){
               if(maxlen<len){
            maxlen=len;
            a=i; b=j;}
            i++; j++;
            if(j<n && grumpy[j]==1) len+=arr[j];
            if(grumpy[i-1]==1) len-=arr[i-1]; 
        }
          
        for(int y=a; y<=b; y++){
            grumpy[y]=0;
        }
        for(int z=0;z<n;z++){
           if(grumpy[z]==0) satisfied+=arr[z];
        }
        return satisfied;
    }
}