/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        
        if(root == null) {
            return list;
        }
        
        if(root.left == null && root.right == null) {
            list.add(root.data);
            return list;
        }
        
        list.add(root.data);
        
        leftTree(root.left, list1);
        leftLeaf(root, list2);
        rightTree(root.right, list4);
        
        list.addAll(list1);
        list.addAll(list2);

        for(int i = list4.size()-1; i >= 0; i--) {
            list.add(list4.get(i));
        }
        
        return list;
    }
    
    public void leftTree(Node root, ArrayList<Integer> list1) {
        if(root == null || (root.left == null && root.right == null)) {
            return;
        }
        
        list1.add(root.data);
        if(root.left != null)
            leftTree(root.left, list1);
        else
            leftTree(root.right, list1);
    }
    
    public void leftLeaf(Node root, ArrayList<Integer> list2) {
        if(root == null) {
            return;
        }
                
        if(root.left == null && root.right == null) {
            list2.add(root.data);
            return;
        }
        
        leftLeaf(root.left, list2);
        leftLeaf(root.right, list2);
    }
    
    public void rightTree(Node root, ArrayList<Integer> list4) {
        if(root == null || (root.left == null && root.right == null)) {
            return;
        }
        
        list4.add(root.data);
        if(root.right != null)
            rightTree(root.right, list4);
        else
            rightTree(root.left, list4);
    }
}