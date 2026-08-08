class Solution {
    int majorityElement(int arr[]) {
        // code here
        int ans = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                ans = arr[i];
            }

            if (arr[i] == ans) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return ans;
        }

        return -1;
    }
}