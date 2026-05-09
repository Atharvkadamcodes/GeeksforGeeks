/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    public int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }
}