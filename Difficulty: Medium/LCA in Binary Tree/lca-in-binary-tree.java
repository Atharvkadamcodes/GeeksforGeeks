/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        
        helper(root, n1, path1);
        helper(root, n2, path2);
        
        int i;
        for(i = 0; i < Math.min(path1.size(),path2.size()); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        
        Node lca = path1.get(i - 1);
        return lca;
    }
    
    boolean helper(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }
        
        path.add(root);
        
        if(root.data == n) {
            return true;
        }
        
        boolean left = helper(root.left, n, path);
        boolean right = helper(root.right, n, path);
        
        if(left || right) {
            return true;
        }
        
        path.remove(path.size() - 1);
        
        return false;
    }
}