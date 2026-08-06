class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int nums[] = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
                nums[arr[i]]++;
        }

        int missing = 0;
        int repeated = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > 1) {
                repeated = i;
            }

            if(nums[i] == 0) {
                missing = i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeated);
        ans.add(missing);

        return ans;
    }
}
