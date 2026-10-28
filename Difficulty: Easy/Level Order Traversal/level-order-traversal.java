/* Structure of Binary Tree Node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	// Constructor
	public Node(int val) {
		data = val;
		left = right = null;
	}
}; */

class Solution {
	public ArrayList<Integer> levelOrder(Node root) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while (!q.isEmpty()) {
			Node curr = q.poll();
			
			if (curr == null) {
				if (q.isEmpty()) {
					break;
				} else {
				    q.add(null);
				}
			} else {
				list.add(curr.data);
				
				if (curr.left != null) {
					q.add(curr.left);
				}
				
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		
		return list;
	}
}
