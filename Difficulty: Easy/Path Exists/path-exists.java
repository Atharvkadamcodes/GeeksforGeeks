class Solution {
    public boolean hasPath(List<List<Integer>> graph, int src, int dest, boolean[] visit) {
        if (src == dest) {
            return true;
        }

        visit[src] = true;

        for (int neighbor : graph.get(src)) {
            if (!visit[neighbor]) {
                if (hasPath(graph, neighbor, dest, visit)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visit = new boolean[V];

        return hasPath(graph, src, dest, visit);
    }
}
