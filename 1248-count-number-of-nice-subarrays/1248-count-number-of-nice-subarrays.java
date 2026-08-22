class Solution { //same as previous a2z question
    public int numberOfSubarraysAtmost(int[] arr, int k) {
        int n=arr.length;
        int i=0,j=0,count=0,sum=0;
        while(j<n){
            if(arr[j]%2==1) count++;
            while(count>k){
                if(arr[i]%2==1){
                count--; }
                i++;
            }
            sum+=j-i+1;
            j++;
        } 
        return sum;
    }
    public int numberOfSubarrays(int[] arr, int k) {
        return numberOfSubarraysAtmost(arr,k)-numberOfSubarraysAtmost(arr,k-1);
    }
}




































// class Solution {
//     public int numberOfSubarrays(int[] arr, int k) {
//         int i=0,j=0,k2=0,a=0,b=0,n=arr.length,count=0;
//         while(i<n && arr[i]%2==0){i++;
//         }
//         while(j<n && k2<k){ //pehle 1 pe i la rhe, kth 1 pe j , i ke pehle mindx 0 pe a , j ke bad maxdx 0 pe b; khtm question
//             if(arr[j++]%2!=0) k2++;
//         } 
//         if(k2<k) return 0;
//         j--;
//         b=j+1;
//         while(b<n && arr[b]%2==0) b++;
//         b--;
//         while(b<n){
//             count+=(i-a+1)*(b-j+1);
//             a=i+1;
//             i++;
//         while(i<n && arr[i]%2==0){ i++; }
//         j=b+1;
//         b=j+1;
//         while(b<n && arr[b]%2==0) b++;
//         b--;
//     }
//     return count;
// }
// }