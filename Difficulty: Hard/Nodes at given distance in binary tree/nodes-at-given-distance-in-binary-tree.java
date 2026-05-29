// class Node
// {
//     int data;
//     Node left, right;
// }

class Solution {
    public static void helper1(Node root, int k, ArrayList<Integer> list) {
        if(root == null || k < 0) {
            return;
        }
        
        if(k == 0) {
            list.add(root.data);
            return;
        }
        
        helper1(root.left, k - 1, list);
        helper1(root.right, k - 1, list);
    }
    
    public static int helper2(Node root, int target, int k, ArrayList<Integer> list) {
        if(root == null) {
            return -1;
        }
        
        if(root.data == target) {
            helper1(root, k, list);
            return 0;
        }
        
        int left = helper2(root.left, target, k, list);
        
        if(left != -1) {
            if(left + 1 == k) {
                list.add(root.data);
            } else {
                helper1(root.right, k - left - 2, list);
            }
            
            return left + 1;
        }
        
        int right = helper2(root.right, target, k, list);
        
        if(right != -1) {
            if(right + 1 == k) {
                list.add(root.data);
            } else {
                helper1(root.left, k - right - 2, list);
            }
            
            return right + 1;
        }
        
        return -1;
    }
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> list = new ArrayList<>();
        
        helper2(root, target, k, list);
        Collections.sort(list);
        
        return list;
        
    }
};