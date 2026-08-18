class Solution {
    public void sort(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    public void rotateArr(int arr[], int d) {
        // code here
        d = d % arr.length;

        sort(arr, 0, arr.length - 1);
        sort(arr, 0, arr.length - d - 1);
        sort(arr, arr.length - d, arr.length - 1);
    }
}