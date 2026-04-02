class Solution {
     public boolean isPerfectSquare(int n){
        int root=(int)(Math.sqrt(n)); //java apne aap typecast nhi krta
        return (root*root==n);
     }
    public boolean isPowerOfFour(int n) {
       if(n<=0) return false; //negative constraints
        return (n &(n-1))==0 && isPerfectSquare(n);  
    }//o(1)  complexity
}//power of 2 with perfect square is power of 4.