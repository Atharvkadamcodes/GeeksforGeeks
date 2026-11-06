/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
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
    
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null) {
            return list;
        }
        
        TreeMap<Integer, Node> map = new TreeMap<>();
        
        Queue<Info> q = new LinkedList<>();
        
        q.add(new Info(0, root));
        q.add(null);
        
        while(!q.isEmpty()) {
            Info curr = q.poll();
            
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                
                if(curr.node.left != null) {
                    q.add(new Info(curr.hd - 1, curr.node.left));
                }
                
                if(curr.node.right != null) {
                    q.add(new Info(curr.hd + 1, curr.node.right));
                }
            }
        }
        
        for(int key : map.keySet()) {
            list.add(map.get(key).data);
        }
        
        return list;
    }
}