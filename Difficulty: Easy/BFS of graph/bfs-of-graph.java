class Solution {
    class Edge {
        int src;
        int dest;
        
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    
    ArrayList<Integer> list = new ArrayList<>();
    
    public void bfsUtil(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        
        while(!q.isEmpty()) {
            int curr = q.remove();
            
            if(!visited[curr]) {
                list.add(curr);
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Edge>[] graph = new ArrayList[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < adj.size(); i++) {
            for (int j : adj.get(i)) {
                graph[i].add(new Edge(i, j));
            }
        }
        
        bfsUtil(graph);
        
        return list;
    }
}