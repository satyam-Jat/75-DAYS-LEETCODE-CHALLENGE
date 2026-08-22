class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int i=0,j=0;
        int len=0;
        int arr[]=new int[3];
        while(j<n){
            arr[s.charAt(j)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){ //use while
            len+=n-j;
            arr[s.charAt(i)-'a']--;
            i++;
            }
             j++;
        }
        return len;
    }
}