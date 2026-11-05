/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
} */

class Solution {
	ArrayList<Integer> zigZagTraversal(Node root) {
		// code here
		ArrayList<Integer> outer = new ArrayList<>();
		
		if (root == null) {
			return outer;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		ArrayList<Integer> inner = new ArrayList<>();
		boolean leftToRight = true;
		
		while (!q.isEmpty()) {
			Node curr = q.poll();
			
			if (curr == null) {
				if (q.isEmpty()) {
					break;
				}
				if (!leftToRight) {
					for(int i = inner.size() - 1; i >= 0; i--) {
					    outer.add(inner.get(i));
					}
				} else {
				    for(int i = 0; i < inner.size(); i++) {
					    outer.add(inner.get(i));
					}
				}
				
				inner.clear();
				
				leftToRight = !leftToRight;
				q.add(null);
			} else {
				inner.add(curr.data);
				
				if (curr.left != null) {
					q.add(curr.left);
				}
				
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		
		if (!inner.isEmpty()) {
			if (!leftToRight) {
				for(int i = inner.size() - 1; i >= 0; i--) {
				    outer.add(inner.get(i));
				}
			} else {
			    for(int i = 0; i < inner.size(); i++) {
			        outer.add(inner.get(i));
				}
			}
		}
		
		return outer;
	}
}
