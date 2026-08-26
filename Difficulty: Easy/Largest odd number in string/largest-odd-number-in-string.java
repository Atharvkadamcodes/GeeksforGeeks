class Solution {
    public String maxOdd(String s) {
        // code here
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }

        return "";
    }
}