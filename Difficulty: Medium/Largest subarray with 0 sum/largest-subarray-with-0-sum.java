class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int len = 0;
        hm.put(0, -1);
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if(!hm.containsKey(sum)) {
                hm.put(sum, i);
            } else {
                int j = hm.get(sum);
                len = Math.max(len, i - j);
            }
        }
        
        return len;
    }
}