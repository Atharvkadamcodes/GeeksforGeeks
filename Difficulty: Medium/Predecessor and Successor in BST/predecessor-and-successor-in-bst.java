/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    Node pred = null;
    Node succ = null;
    
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        predecessor(root, key);
        successor(root, key);
        
        ArrayList<Node> ans = new ArrayList<>();

        ans.add(pred);
        ans.add(succ);

        return ans;
    }
    
    public void predecessor(Node root, int key) {
        if(root == null) {
            return;
        }
        
        if(root.data < key) {
            pred = root;
            predecessor(root.right, key);
        } else {
            predecessor(root.left, key);
        }
    }
    
    public void successor(Node root, int key) {
        if(root == null) {
            return;
        }
        
        if(root.data > key) {
            succ = root;
            successor(root.left, key);
        } else {
            successor(root.right, key);
        }
    }
}