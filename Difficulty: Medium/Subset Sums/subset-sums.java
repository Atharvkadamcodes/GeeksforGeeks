class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        helper(arr, list, 0, 0);
       Collections.sort(list);
        return list;
    }
    
    public void helper(int[] arr, ArrayList<Integer> list, int idx, int sum) {
        if(idx == arr.length) {
            list.add(sum);
            return;
        }
        
        helper(arr, list, idx + 1, sum + arr[idx]);
        
        helper(arr, list, idx + 1, sum);
    }
}