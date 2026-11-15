/* Structure of BST tree Node
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
    ArrayList<Integer> list = new ArrayList<>();
    
    public ArrayList<Integer> nodesInRange(Node root, int low, int high) {
        // code here
        if(root == null) {
            return list;
        }
        
        helper(root, low, high);
        return list;
    }
    
    public void helper(Node root, int low, int high) {
        if(root.data >= low && root.data <= high) {
            nodesInRange(root.left, low, high);
            list.add(root.data);
            nodesInRange(root.right, low, high);
        } else if(root.data < low) {
            nodesInRange(root.right, low, high);
        } else {
            nodesInRange(root.left, low, high);
        }
    }
}