class Solution {
    int search(int[] arr, int key) {
        // code here
        sort(arr, 0, arr.length - 1);

        int idx = -1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] > arr[i]) {
                idx = i;
            }
        }

        sort(arr, 0, idx);
        sort(arr, idx + 1, arr.length - 1);

        int sortedIndex = binary(arr, key);

        if (sortedIndex == -1) {
            return -1;
        }

        int rotationStart = arr.length - idx - 1;

        return (sortedIndex + rotationStart) % arr.length;
    }
    
    public void sort(int[] arr, int left, int right) {
        while(left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public int binary(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}