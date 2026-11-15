/* Structure of a Binary Search Tree node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int val) {
		data = val;
		left = right = null;
	}
}; */

class Solution {
	public Node delNode(Node root, int x) {
		// code here
		if(root == null) {
		    return null;
		}
		
		if (x < root.data) {
			root.left = delNode(root.left, x);
		} else if (x > root.data) {
			root.right = delNode(root.right, x);
		} else {
			// No node(leaf Node)
			if (root.left == null && root.right == null) {
				return null;
			}
			
			// One node
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			
			// Two nodes
			Node IS = inorderSuc(root.right);
			root.data = IS.data;
			root.right = delNode(root.right, IS.data);
		}
		
		return root;
	}
	
	public Node inorderSuc(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		
		return root;
	}
}
