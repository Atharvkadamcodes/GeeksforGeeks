class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        return Sorted(arr, 0);
    }
    
    public boolean Sorted(int[] arr, int i) {
        // code here
        if(i == arr.length - 1) {
            return true;
        }
        
        if(arr[i] > arr[i + 1]) {
            return false;
        }
        
        return Sorted(arr, i + 1);
    }
}