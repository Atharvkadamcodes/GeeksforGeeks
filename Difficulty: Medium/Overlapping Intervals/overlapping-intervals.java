class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        int[] last = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int[] current = arr[i];

            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                result.add(last);
                last = current;
            }
        }

        result.add(last);

        return result;
    }
}