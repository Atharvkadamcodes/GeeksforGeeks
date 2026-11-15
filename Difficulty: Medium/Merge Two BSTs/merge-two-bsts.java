/* Structure of a Binary Search Tree node
class Node {
	int data;
	Node left, right;
	
	public Node(int val)
	{
		data = val;
		left = right = null;
	}
} */

class Solution {
	public ArrayList<Integer> merge(Node r1, Node r2) {
		// code here
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		inorder(r1, list1);
		inorder(r2, list2);
		
		list1.addAll(list2);
		
		Collections.sort(list1);
		
		return list1;
	}
	
	public void inorder(Node root, ArrayList<Integer> list) {
		if (root == null) {
			return;
		}
		
		inorder(root.left, list);
		list.add(root.data);
		inorder(root.right, list);
	}
}
