/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/

class Solution {
    int min = Integer.MAX_VALUE;
    
    public int minValue(Node root) {
        // code here
        helper(root);
        
        return min;
    }
    
    public void helper(Node root) {
        if(root == null) {
            return;
        }
        
        if(root.data < min) {
            min = root.data;
        }
        
        minValue(root.left);
        minValue(root.right);
    }
}