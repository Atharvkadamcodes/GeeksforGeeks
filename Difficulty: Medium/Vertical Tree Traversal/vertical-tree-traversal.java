/* Structure of binary tree node
class Node {
	int data;
	Node left;
	Node right;
	
	Node(int val) {
		data = val;
		left = right = null;
	}
} */

class Solution {
	class Info {
		int hd;
		Node node;
		
		public Info(int hd, Node node) {
			this.hd = hd;
			this.node = node;
		}
	}
	
	public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
		// code here
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		if (root == null) {
			return list;
		}
		
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		
		Queue<Info> q = new LinkedList<>();
		
		q.add(new Info(0, root));
		q.add(null);
		
		while (!q.isEmpty()) {
			Info curr = q.poll();
			
			if (curr == null) {
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				map.putIfAbsent(curr.hd, new ArrayList<>());
                map.get(curr.hd).add(curr.node.data);
				
				if (curr.node.left != null) {
					q.add(new Info(curr.hd - 1, curr.node.left));
				}
				
				if (curr.node.right != null) {
					q.add(new Info(curr.hd + 1, curr.node.right));
				}
			}
		}
		
		for (int key : map.keySet()) {
			list.add(map.get(key));
		}
		
		return list;
	}
}
