/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        // code here
        if(root == null) {
            return false;
        }
        
        if(root.data == key) {
            return true;
        }
        
        boolean left = search(root.left, key);
        boolean right = search(root.right, key);
        
        if(left || right) {
            return true;
        }
        
        return false;
    }
}