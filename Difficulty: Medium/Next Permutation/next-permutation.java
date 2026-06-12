class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) {
            Arrays.sort(arr);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        Arrays.sort(arr, pivot + 1, n);
    }
}