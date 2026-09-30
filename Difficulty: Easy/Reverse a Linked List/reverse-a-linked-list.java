/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        return helper(head, head, null);
    }
    
    Node helper(Node head, Node curr, Node prev) {
        if(curr == null) {
            return prev;
        }
        
        Node next = curr.next;
        curr.next = prev;
        
        return helper(head, next, curr);
    }
}