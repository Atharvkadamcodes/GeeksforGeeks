/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        Node = item;
        left = right = null;
    }
}*/

class Solution {
    public Node helper(ArrayList<Integer> list, int si, int end) {
        if(si > end) {
            return null;
        }

        int mid = si + (end - si) / 2;

        Node node = new Node(list.get(mid));

        node.left = helper(list, si, mid - 1);
        node.right = helper(list, mid + 1, end);

        return node;
    }

    public void inorder(Node root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    
    Node balanceBST(Node root) {
        // Add your code here.
        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return helper(list, 0, list.size() - 1);
    }
}