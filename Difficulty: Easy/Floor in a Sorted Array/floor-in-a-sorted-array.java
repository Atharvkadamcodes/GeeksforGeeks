class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int floor = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] <= x) {
                floor = mid;
                start = mid + 1;
            } else {
                 end = mid - 1;
            }
        }

        return floor;
    }
}
