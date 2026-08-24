class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int[] arr = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }

        int i = a.length - 1;
        int j = b.length - 1;
        int k = arr.length - 1;

        while(j >= 0) {
            if(i >= 0 && arr[i] > b[j]) {
                arr[k] = arr[i];
                k--;
                i--;
            } else {
                arr[k] = b[j];
                k--;
                j--;
            }
        }

        int start = 0;
        int end = arr.length - 1;

        int mid = arr.length / 2;

        if(arr.length % 2 != 0) {
            return arr[mid];
        }

        return (arr[mid - 1] + arr[mid]) / 2.0;
    }
}