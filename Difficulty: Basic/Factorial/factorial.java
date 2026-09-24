class Solution {
    int factorial(int n) {
        // code here
        if(n == 0) {
            return 1;
        }
        
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }
}
