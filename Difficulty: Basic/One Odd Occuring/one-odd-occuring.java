class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++) {
            ans ^= arr[i];
        }
        
        return ans;
    }
}