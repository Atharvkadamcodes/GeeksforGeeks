class Solution {
    int[] countGreater(int arr[], int indices[]) {
        // code here
        int count = 0;
        int ans[] = new int[indices.length];
        
        for(int i = 0; i < indices.length; i++) {
            count = 0;
            int index = indices[i];
            for(int j = index + 1; j < arr.length; j++) {
                if(arr[index] < arr[j]) {
                    count++;
                }
            }
            
            ans[i] = count;
        }
        
        return ans;
    }
}
