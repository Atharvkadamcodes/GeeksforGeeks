/*
   class Node{
       int data;
       Node left;
       Node right;
       Node nextRight;
       Node(int data){
           this.data = data;
           left=null;
           right=null;
           nextRight = null;
       }
   }

   */

class Solution {
    public Node connect(Node root) {
        // code here.
        if(root == null) {
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();

            if(currNode == null) {
                
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                currNode.nextRight = q.peek();

                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        return root;
    }
}