/*
Definition for Node
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
    int ceil = -1;
    
	public int findMaxFork(Node root, int k) {
		// code here.
		helper(root, k);
		return ceil;
	}
	
	public void helper(Node root, int k) {
		if (root == null) {
			return;
		}
		
		if (root.data == k) {
			ceil = root.data;
		} else if (root.data < k) {
		    ceil = root.data;
			helper(root.right, k);
		} else {
			helper(root.left, k);
		}
	}
}
