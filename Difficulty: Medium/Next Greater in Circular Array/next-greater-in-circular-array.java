class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(-1);
        }
        
        for(int i = 2 * arr.length - 1; i >= 0; i--) {
            int idx = i % arr.length;
            
            while(!st.isEmpty() && st.peek() <= arr[idx]) {
                st.pop();
            }
            
            if(i < arr.length && !st.isEmpty()) {
                list.set(idx, st.peek());
            }
            
            st.push(arr[idx]);
        }
        
        return list;
    }
}