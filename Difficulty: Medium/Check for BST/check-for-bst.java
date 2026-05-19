/*
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
    ArrayList<Integer> arr = new ArrayList<>();

    public void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        arr.add(root.data);
        inorder(root.right);
    }
    
    public boolean isBST(Node root) {
        // code here
        inorder(root);

        for(int i = 1; i < arr.size(); i++) {

            if(arr.get(i) <= arr.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}