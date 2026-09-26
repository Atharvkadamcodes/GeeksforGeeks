class Solution {
    public List<String> powerSet(String s) {
        // Code here
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(s, list, sb, 0);
        Collections.sort(list);
        return list;
    }
    
    public void helper(String s, ArrayList<String> list, StringBuilder sb, int idx) {
        if(idx == s.length()) {
            list.add(sb.toString());
            return;
        }
        
        sb.append(s.charAt(idx));
        helper(s, list, sb, idx + 1);
        sb.deleteCharAt(sb.length() - 1);
        
        helper(s, list, sb, idx + 1);
    }
}