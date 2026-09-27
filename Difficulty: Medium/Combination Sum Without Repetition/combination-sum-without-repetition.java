class Solution {
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        helper(arr, target, outer, inner, 0, 0);
            return outer;
        }

    public void helper(int[] arr, int target, ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> inner, int idx, int sum) {
        if(sum == target) {
            if(!outer.contains(inner)) {
                outer.add(new ArrayList<>(inner));
            }
            return;
        } else if(sum > target || idx == arr.length) {
            return;
        }

        inner.add(arr[idx]);
        helper(arr, target, outer, inner, idx + 1, sum + arr[idx]);
        inner.remove(inner.size() - 1);

        helper(arr, target, outer, inner, idx + 1, sum);
    }
}