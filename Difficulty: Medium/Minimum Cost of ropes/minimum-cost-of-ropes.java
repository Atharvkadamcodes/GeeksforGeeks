class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        
        int ans = 0;
        while(pq.size() > 1) {
            int i = pq.remove();
            int j = pq.remove();
            ans += i + j;
            pq.add(i + j);
        }
        
        return ans;
    }
}