/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public int kthLargest(Node root, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, k, list);
        
        return list.remove(list.size() - k);
    }
    
    public void helper(Node root, int k, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        
        helper(root.left, k, list);
        list.add(root.data);
        helper(root.right, k, list);
    }
}