class Solution {

    public int findMaxIndex(int[][] mat, int n, int m, int col) {  // main function se data le rhe as argument to perform functions.
        int maxValue = -1; 
        int index = -1;

        for (int i = 0; i < n; i++) { // traversing in the row wise
            if (mat[i][col] > maxValue) {  
                maxValue = mat[i][col];
                index = i;// any element in the row is bigg then inputinside max and return its index
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {  //main funtion which leetcode compiler given us

        int n = mat.length;
        int m = mat[0].length;

        int low = 0;  // make boundariesfor performing operations
        int high = m - 1;

        while (low <= high) {

            int mid = (low + high) / 2;   

            int maxRowIndex = findMaxIndex(mat, n, m, mid);     // yaha use kr rhe us function ka kia hua kaam , with passing parameters according to user.

            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;  //agr left exist krta hai to (ye):brna ye(-1)

            int right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : -1;  //for right

            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) { //left or right dono se bda hai to bahi peak hoga
                return new int[]{maxRowIndex, mid}; 
            }

            else if (mat[maxRowIndex][mid] < left) {
                high = mid - 1;
            }

            else {
                low = mid + 1;  
            }
        }

        return new int[]{-1, -1}; // return the final answer inside the array without creating the array.
    }  // new use when we creat array or object. 
}