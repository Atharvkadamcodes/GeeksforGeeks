/*Structure of the doubly linked list  Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/

class Solution {
    public Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node curr = head;
        
        while(curr != null) {
            if(curr.data == x) {
                if(curr == head) {
                    head = curr.next;
                }
                
                if(curr.prev != null) {
                    curr.prev.next = curr.next;
                }
                
                if(curr.next != null) {
                    curr.next.prev = curr.prev;
                }
            }
            
            curr = curr.next;
        }
        
        return head;
    }
}