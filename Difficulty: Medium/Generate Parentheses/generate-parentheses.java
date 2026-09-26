class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        int countOpen = 1;
        int countClose = 0;
        helper(n, list, sb, countOpen, countClose);
        return list;
    }

    public void helper(int n, ArrayList<String> list, StringBuilder sb, int countOpen,int countClose) {
        if(sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        if(countOpen < n / 2) {
            sb.append('(');
            helper(n, list, sb, countOpen + 1, countClose);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(countClose < countOpen) {
            sb.append(')');
            helper(n, list, sb, countOpen, countClose + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}