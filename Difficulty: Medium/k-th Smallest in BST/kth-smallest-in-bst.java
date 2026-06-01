/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> list = new ArrayList<>();

    public void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }

    public int kthSmallest(Node root, int k) {
        inorder(root);

        if(k <= 0 || k > list.size()) {
            return -1;
        }

        return list.get(k - 1);
    }
}