/* Structure of Binary Tree Node
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
	public ArrayList<Integer> postOrder(Node root) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		
		if (root == null) {
			return list;
		}
		
		Stack<Node> st = new Stack<>();
		
		st.push(root);
		
		while (!st.isEmpty()) {
			Node curr = st.pop();
			
			list.add(curr.data);
			
			if (curr.left != null) {
				st.push(curr.left);
			}
			
			if (curr.right != null) {
				st.push(curr.right);
			}
		}
		
		Collections.reverse(list);
		
		return list;
	}
}
