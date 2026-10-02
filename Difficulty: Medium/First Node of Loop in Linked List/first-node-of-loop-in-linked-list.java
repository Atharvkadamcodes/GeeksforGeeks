/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        HashSet<Node> set = new HashSet<>();
        
        Node curr = head;
        
        while(curr != null) {
            
            if(set.contains(curr)) {
                return curr.data;
            }
            
            set.add(curr);
            curr = curr.next;
        }
        
        return -1;
    }
}