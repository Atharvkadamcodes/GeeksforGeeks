class Solution {
    public int findMin(int n) {
        // code here
        int count = 0;
        int[] coins = {10, 5, 2, 1};
        
        for(int coin : coins) {
            count += n / coin;
            n %= coin;
        }
        
        return count;
    }
}
