class Solution {
    public boolean canReach(int[] arr) {
        // code here
        int furtherMost = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(i > furtherMost) {
                return false;
            }
            
            furtherMost = Math.max(furtherMost, i + arr[i]);
        }
        
        if(furtherMost > arr.length - 1) {
            return true;
        }
        
        return false;
     }
}