class Solution {
    public boolean search(int[] arr, int key) {
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
            
            return binary(arr, key);
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

        public boolean binary(int[] arr, int key) {
            int start = 0;
            int end = arr.length - 1;
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] == key) {
                    return true;
                } else if(key > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return false;
        }
}
