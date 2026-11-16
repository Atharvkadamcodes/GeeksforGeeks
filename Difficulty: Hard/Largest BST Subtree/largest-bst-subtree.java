/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */

class Solution {
    int maxSize = 0;
    
    class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        
        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    public int largestBst(Node root) {
        // code here
        helper(root);
        
        return maxSize;
    }
    
    public Info helper(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        Info leftInfo = helper(root.left);
        Info rightInfo = helper(root.right);
        
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        
        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }
        
        if(leftInfo.isBST && rightInfo.isBST) {
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, min, max);
        }
        
        return new Info(false, size, min, max);
    }
}