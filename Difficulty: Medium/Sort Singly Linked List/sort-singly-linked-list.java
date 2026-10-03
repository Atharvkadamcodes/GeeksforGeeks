/* Structure of a Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
       data = d;
       next = null;
    }
}*/
class Solution {
    public Node sortLL(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = midNode(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = sortLL(head);
        Node newRight = sortLL(rightHead);

        return mergeLL(newLeft, newRight);
    }

    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node mergeLL(Node head1, Node head2) {
        Node ll = new Node(-1);
        Node temp = ll;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return ll.next;
    }
}