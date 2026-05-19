/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int sum = 0;

    public void sumBST(Node root, int low, int high) {
        if(root == null) {
            return;
        }

        if(root.data >= low && root.data <= high) {
            sumBST(root.left, low, high);
            sum += root.data;
            sumBST(root.right, low, high);
        } else if(root.data < low) {
            sumBST(root.right, low, high);
        } else {
            sumBST(root.left, low, high);
        }
    }
    
    public int nodeSum(Node root, int l, int r) {
        // code here
        sumBST(root, l, r);

        return sum;
    }
}
