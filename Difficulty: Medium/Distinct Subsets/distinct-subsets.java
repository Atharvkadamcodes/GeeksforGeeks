class Solution {
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        helper(arr, outer, inner, 0);
        return outer;
    }

    public void helper(int[] arr, ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> inner, int idx) {
      
        outer.add(new ArrayList<>(inner));
        
        for(int i = idx; i < arr.length; i++) {
            if(i > idx && arr[i] == arr[i - 1]) {
                continue;
            }
            
            
            inner.add(arr[i]);
            helper(arr, outer, inner, i + 1);
            inner.remove(inner.size() - 1);
        }
    }
}
