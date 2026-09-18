class Solution {
    public int myAtoi(String s) {
        // code here
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        boolean isNegative = false;

        int i = 0;

        if (s.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        } 
        else if (s.charAt(0) == '+') {
            i = 1;
        }

        int num = 0;

        for(; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                break;
            }

            int digit = (s.charAt(i) - '0');

            if(num > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            num = num * 10 + digit;
        }

        return isNegative ? -num : num;
    }
}