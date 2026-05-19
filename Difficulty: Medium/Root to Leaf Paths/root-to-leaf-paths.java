/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<ArrayList<Integer>> path = new ArrayList<>();
    
    public void printRootToLeaf(Node root,
                                ArrayList<Integer> innerPath) {

        if(root == null) {
            return;
        }

        innerPath.add(root.data);

        if(root.left == null && root.right == null) {
            path.add(new ArrayList<>(innerPath));
        }

        printRootToLeaf(root.left, innerPath);
        printRootToLeaf(root.right, innerPath);

        innerPath.remove(innerPath.size() - 1);
    }
    
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        
        ArrayList<Integer> innerPath = new ArrayList<>();

        printRootToLeaf(root, innerPath);

        return path;
    }
    
}