/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int ceil = -1;
    
    int findCeil(Node root, int x) {
        // code here
        helper(root, x);
        
        return ceil;
    }
    
    void helper(Node root, int x) {
        if(root == null) {
            return;
        }
        
        if(root.data == x) {
            ceil = root.data;
        } else if (root.data < x) {
            helper(root.right, x);
        } else {
            ceil = root.data;
            helper(root.left, x);
        }
    }
}