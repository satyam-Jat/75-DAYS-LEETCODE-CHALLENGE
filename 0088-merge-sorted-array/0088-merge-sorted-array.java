class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int r1 = m - 1;        // last element in arr1
        int r2 = n - 1;        // last element in arr2
        int w  = m + n - 1;    // write pointer (end of arr1)

        while (r2 >= 0) {   // only arr2 check is enough
            if (r1 >= 0 && arr1[r1] > arr2[r2]) {
                arr1[w--] = arr1[r1--];
            } else {
                arr1[w--] = arr2[r2--];
            }
        }
    }
}