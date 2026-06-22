class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> KthLargest = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            KthLargest.add(arr[i]);

            if (KthLargest.size() > k) {
                KthLargest.poll();
            } 
            
            if(KthLargest.size() == k) {
                ans.add(KthLargest.peek());
            } else {
                ans.add(-1);
            }
        }
        
        return ans;
    }
}