class Solution {
    public static int countSubstring(String s) {
        // code here
        int[] last = {-1, -1, -1};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            last[ch - 'a'] = i;

            int min = Math.min(last[0], Math.min(last[1], last[2]));

            if (min != -1) {
                count += min + 1;
            }
        }

        return count;
    }
}
