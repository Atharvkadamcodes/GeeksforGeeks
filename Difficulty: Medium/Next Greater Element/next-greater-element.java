class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(-1);
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                list.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return list;
    }
}