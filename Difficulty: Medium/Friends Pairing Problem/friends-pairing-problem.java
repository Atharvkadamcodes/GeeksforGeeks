class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if(n == 0 || n == 1) {
            return 1;
        }
        
        int fnm1 = countFriendsPairings(n - 1);
        int fnm2 = (n - 1) * countFriendsPairings(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
}
