class Solution {
    class Pair {
        int node;
        int parent;
        
        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<Integer>[] graph = new ArrayList[V];
        
        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                Queue<Pair> q = new LinkedList<>();
                q.add(new Pair(i, -1));
                visited[i] = true;

                while (!q.isEmpty()) {

                    Pair p = q.remove();
                    int curr = p.node;
                    int parent = p.parent;

                    for (int neighbour : graph[curr]) {

                        if (!visited[neighbour]) {
                            visited[neighbour] = true;
                            q.add(new Pair(neighbour, curr));
                        }
                        else if (neighbour != parent) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}