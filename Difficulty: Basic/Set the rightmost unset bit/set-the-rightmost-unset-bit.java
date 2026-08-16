class Solution {
    public int setBit(int n) {
        // code here
        int count = 0;
        int lsb = 1;
        int num = n;
        
        while(lsb != 0) {
            if((num & 1) == 0) {
                lsb = 0;
            }
            num = num >> 1;
            count++;
        }
        
        return n = n | (1 << count - 1);
    }
}