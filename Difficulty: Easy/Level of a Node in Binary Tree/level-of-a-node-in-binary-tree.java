class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        if(node == null) {
            return 0;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        
        int level = 1;
        
        while(!q.isEmpty()) {
            Node currNode = q.poll();
            
            if(currNode == null) {
                level++;
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(currNode.data == data) {
                    return level;
                }
                
                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        
        return 0;
    }
}