/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
} */

class Solution {
    static int max;
    static int min;
    
	public static int findMax(Node root) {
		// code here
		max = Integer.MIN_VALUE;
		
		helperMax(root);
		
		return max;
	}
	
	public static int findMin(Node root) {
		// code here
		min = Integer.MAX_VALUE;
		
		helperMin(root);
		
		return min;
	}
	
	public static void helperMax(Node root) {
		if (root == null) {
			return;
		}
		
		if (root.data > max) {
			max = root.data;
		}
		
		helperMax(root.left);
		helperMax(root.right);
	}
	
	public static void helperMin(Node root) {
		if (root == null) {
			return;
		}
		
		if (root.data < min) {
			min = root.data;
		}
		
		helperMin(root.left);
		helperMin(root.right);
	}
}
