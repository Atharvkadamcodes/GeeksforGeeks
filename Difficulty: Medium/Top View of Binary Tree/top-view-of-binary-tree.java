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
        Node node;
        int hd;
        
        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
         
        Queue<Info> q = new LinkedList<>();
        
        HashMap<Integer, Node> map = new HashMap<>();
        
        if(root == null) return list;
        
        int min = 0, max = 0;
        
        q.add(new Info(root, 0));
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
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        
        for(int i = min; i <= max; i++) {
            list.add(map.get(i).data);
        }
        
        return list;
    }
}