class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int x : a) {
            set.add(x);
        }

        for (int x : b) {
            set.add(x);
        }
        
        for (int x : set) {
            list.add(x);
        }

        return list;
    }
}