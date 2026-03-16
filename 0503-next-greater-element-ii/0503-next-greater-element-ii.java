class Solution {
    public int[] nextGreaterElements(int[] arr) {  

        int n = arr.length;
        int[] ans = new int[n]; //nyi array jisme dalte jaenge
        Arrays.fill(ans, -1);   // default -1
        Stack<Integer> st = new Stack<>(); //stack ulta bhr rhe array ko

        for(int i = 2*n - 1; i >= 0; i--) { //2n for circular n+n

            int num = arr[i % n];   // circular bn jaegi array remainder based

            while(!st.isEmpty() && st.peek() <= num) {
                st.pop();  // jb tk chora mil rha ya stack empty nahi h. , pop
            }

            if(i < n) {   //final real index pe hi sb dalna hai, circular to condition thi check krne wali ki last ke left me bhi bda to nahi 
                if(!st.isEmpty()) { 
                    ans[i] = st.peek();  // bdha wala stack ka dalte jao
                }
            }

            st.push(num); //stack me dalo hr i bdlne se pehle taki check kia ja ske
        }

        return ans;
    }
}