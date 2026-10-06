class Solution {
    public boolean isBalanced(String s) {
        // code here
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while(i != s.length()) {
            char ch = s.charAt(i);

            if(ch =='(' || ch =='[' || ch =='{') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(ch == ')' && top != '(') return false;
                if(ch == ']' && top != '[') return false;
                if(ch == '}' && top != '{') return false;
            }

            i++;
        }

        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
