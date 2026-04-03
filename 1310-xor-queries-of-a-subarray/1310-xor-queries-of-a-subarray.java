
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int m=queries.length;
        int[] arr1=new int[m];
        for(int i=1;i<n;i++){
            arr[i]^=arr[i-1];
        }

        for(int i=0;i<m;i++)
        {
            int left=queries[i][0],right=queries[i][1];
      if(left==0) arr1[i]=arr[right];
         else  arr1[i]=arr[left-1]^arr[right];
        }
        return arr1;
    }
}

















//TLE
/*class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int m=queries.length;
        int[] arr1=new int[m];

        for(int i=0;i<m;i++)
        {
            int left=queries[i][0],right=queries[i][1];
         for(int j=left;j<=right;j++)
        {
            arr1[i]^=arr[j];
        }
        }
        return arr1;
    }
}
*/