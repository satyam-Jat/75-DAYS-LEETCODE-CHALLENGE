class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans=new int[n];
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int last=arr[i][1];
            int seat=arr[i][2];
            ans[first-1]+=seat;
            if(last-1+1<n) ans[last]-=seat;}
            for(int j=1;j<n;j++){
                ans[j]+=ans[j-1];
            }
        return ans;
    }
}