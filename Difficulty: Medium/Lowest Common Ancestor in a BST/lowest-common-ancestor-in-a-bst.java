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
    public void helper(Node root, Node node, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }

        if(root.data == node.data) {
            list.add(root.data);
            return;
        } else if(root.data > node.data) {
            list.add(root.data);
            helper(root.left, node, list);
        } else {
            list.add(root.data);
            helper(root.right, node, list);
        }
    }

    public Node find(ArrayList<Integer> listn1, ArrayList<Integer> listn2) {
        Node lca = null;

        int i = 0;
        for(; i < listn1.size() && i < listn2.size(); i++) {
            if(!listn1.get(i).equals(listn2.get(i))) {
            break;
        }
}

        lca = new Node(listn1.get(i - 1));
        return lca;
    }

    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        ArrayList<Integer> listn1 = new ArrayList<>();
        ArrayList<Integer> listn2 = new ArrayList<>();

        helper(root, n1, listn1);
        helper(root, n2, listn2);

        return find(listn1, listn2);
    }
}