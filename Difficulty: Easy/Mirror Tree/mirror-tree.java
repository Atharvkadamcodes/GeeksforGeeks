/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mirror(Node root) {
        // code here
        if(root == null) {
            return;
        }
        
        Node newTree = root.left;
        root.left = root.right;
        root.right = newTree;
        
        mirror(root.left);
        mirror(root.right);
    }
}