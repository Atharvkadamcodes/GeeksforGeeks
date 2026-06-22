class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> ansArr = new ArrayList<>();

        for(int i = 0; i < points.length; i++) {
            int dist = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new int[]{dist, points[i][0], points[i][1]});
        }

        for(int i = 0; i < k; i++) {
            int[] curr = pq.poll();
            ArrayList<Integer> point = new ArrayList<>();
            point.add(curr[1]);
            point.add(curr[2]);
            
            ansArr.add(point);
        }

        return ansArr;
    }
}