class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String>list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n, list, sb);
        return list;
    }
    
    public void helper(int n, ArrayList<String> list, StringBuilder sb) {
        if(sb.length() == n) {
            list.add(sb.toString());
            return;
        }
        
        sb.append('0');
        helper(n, list, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append('1');
        helper(n, list, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
