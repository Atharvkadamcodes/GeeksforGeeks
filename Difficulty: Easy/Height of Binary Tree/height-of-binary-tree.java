/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root == null) {
            return -1;
        }
        
        int leftHeig = height(root.left);
        int rightHeig = height(root.right);
        
        return Math.max(leftHeig, rightHeig) + 1;
    }
}