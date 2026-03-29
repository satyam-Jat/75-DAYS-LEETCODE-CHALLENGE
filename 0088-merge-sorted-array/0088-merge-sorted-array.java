class Solution{
public void merge(int[] arr, int m, int[] brr, int n) {
    int[] temp = new int[m];
    for (int i = 0; i < m; i++) {
        temp[i] = arr[i]; //temp me arr dal rhe
    }
    int i = 0; 
    int k = 0;
    int j = 0; 
    while (k < m && j < n) {
        if (temp[k] <= brr[j]) {  //jo chota hai usko arr me dalte jao
            arr[i++] = temp[k++];
        } else {
            arr[i++] = brr[j++];
        }
    }
    while (k < m) {
        arr[i++] = temp[k++]; // bche hue direct uthakr daldo,arr me kuch bhi ho sb override ho rha hai
    }

    while (j < n) {
        arr[i++] = brr[j++]; //same
    }
}
}