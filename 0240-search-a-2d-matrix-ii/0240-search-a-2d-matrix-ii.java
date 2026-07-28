
class Solution {
    public int lower(int[] arr, int x) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

        public boolean searchMatrix(int[][] arr,int target) {
        int m = arr[0].length;
        int mx = -1;
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            int idx = lower(arr[i], target);

          
        if (idx != -1 && arr[i][idx] == target) {
            return true;
        }
        
    }return false;
        }
}