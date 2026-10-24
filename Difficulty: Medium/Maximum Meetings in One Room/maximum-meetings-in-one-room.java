class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        int[][] arr = new int[s.length][3];
        for(int i = 0; i < s.length; i++) {
            arr[i][0] = s[i];
            arr[i][1] = f[i];
            arr[i][2] = i + 1;
        }
        
        Arrays.sort(arr, (a,b) -> a[1] - b[1]);
        
        int end = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(list.isEmpty() || arr[i][0] > end) {
                list.add(arr[i][2]);
                end = arr[i][1];
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}