/* Structure of a Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public Node helper(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        
        return root;
    }
    
    public Node delNode(Node root, int x) {
        // code here
        if(root == null) {
            return null;
        }

        if(root.data > x) {
            root.left = delNode(root.left, x);
        } else if(root.data < x) {
            root.right = delNode(root.right, x);
        } else {
            if(root.left == null && root.right == null) {
                return null;
            }
            
            if(root.left == null) {
                return root.right;
            }
            
            if(root.right == null) {
                return root.left;
            }
            
            Node IS = helper(root.right);
            root.data = IS.data;
            root.right = delNode(root.right, IS.data);
        }
        
        return root;
    }
}