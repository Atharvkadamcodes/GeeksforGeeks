/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int size = 0;
        Node curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        
        if(k > size) return -1;

        int pos = size - k;
        curr = head;
        
        for(int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        
        return curr.data;
    }
}