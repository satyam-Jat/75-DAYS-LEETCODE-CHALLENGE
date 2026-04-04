class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
         int pre[]=new int[n+1];
        int suf[]=new int[n+1];
        int pen[]=new int[n+1];
        for(int i=1;i<=n;i++){
           
            pre[i]+=pre[i-1];
            if(customers.charAt(i-1)=='N') pre[i]+=1;
        }
         for(int i=n-1;i>=0;i--){
           
            suf[i]+=suf[i+1];
            if(customers.charAt(i)=='Y') suf[i]+=1;
        }
         for(int i=0;i<n+1;i++){
           
            pen[i]=pre[i]+suf[i];
        }
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n+1;i++){
            mn=Math.min(pen[i],mn);
           
        }
        for(int i=0;i<=n;i++){
             if(pen[i]==mn) return i;
        }
return 0;
    }
}