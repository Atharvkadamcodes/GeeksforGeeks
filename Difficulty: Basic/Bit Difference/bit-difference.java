class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        return Integer.bitCount(a ^ b);
    }
}
