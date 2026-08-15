class Solution {
    static boolean isEven(int n) {
        // code here
        int bitwise = 1;
        
        if((n & bitwise) == 0) {
            return true;
        }
        
        return false;
    }
}