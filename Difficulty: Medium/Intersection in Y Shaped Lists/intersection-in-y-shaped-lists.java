/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node currHeadA = head1;
        Node currHeadB = head2;

        while(currHeadA != currHeadB) {
            currHeadA = (currHeadA == null) ? head2 : currHeadA.next;
            currHeadB = (currHeadB == null) ? head1 : currHeadB.next;
        }

        return currHeadA;
    }
}