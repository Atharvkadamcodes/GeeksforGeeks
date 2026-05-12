/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    
    public void helper(Node root, ArrayList<Integer> list) {

        if(root == null) {
            return;
        }

        list.add(root.data);

        helper(root.left, list);

        helper(root.right, list);
    }
    
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        
        helper(root, list);
        
        return list;
    }
}