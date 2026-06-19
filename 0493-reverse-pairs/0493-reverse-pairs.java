class Solution {
    int count = 0;
    public int reversePairs(int arr[]) { 
        mergesort(arr);
        return count; //yhi functions se gfg count return expect krta hai
    }

    public  void inversion(int[] a, int[] b) { //ye main function hai jisme 2 array merge hote hote apna inversoion nikalte ja rhi hai
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if ((long)a[i] > (long)2*(long)b[j]) {
                count += (a.length - i);
                j++;
            } else {
                i++;
            }
        }
    }
    public void merge(int[] a, int[] b, int[] c) { //fun1 for merge sort
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])  
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (j < b.length)
            c[k++] = b[j++];

        while (i < a.length)
            c[k++] = a[i++];
    }
    public  void mergesort(int[] arr) { //fun2 for merge sort by pw skils
        int n = arr.length;
        if (n <= 1)
            return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];   
        
        for (int i = 0; i < n / 2; i++)
            a[i] = arr[i];

        for (int i = 0; i < n - n / 2; i++)
            b[i] = arr[i + n / 2];

        mergesort(a);
        mergesort(b);

        inversion(a, b); //this is a magic for inversion

        merge(a, b, arr);
    }
}