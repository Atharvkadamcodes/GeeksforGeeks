/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    class Pair {
        int data;
        int level;
    
        Pair(int data, int level) {
            this.data = data;
            this.level = level;
        }
    }

    TreeMap<Integer, Pair> tm = new TreeMap<>();
    
    public void dfs(Node root, int height, int level) {
        if(root == null) {
            return;
        }
        
        if(!tm.containsKey(height)) {
            tm.put(height,new Pair(root.data, level));
        } else {
            if(level >= tm.get(height).level) {
                tm.put(height,new Pair(root.data, level));
            }
        }
        
        dfs(root.left, height - 1, level + 1);
        dfs(root.right, height + 1, level + 1);
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        dfs(root, 0, 0);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int ht : tm.keySet()) {
            list.add(tm.get(ht).data);
        }
        
        return list;
    }
}
