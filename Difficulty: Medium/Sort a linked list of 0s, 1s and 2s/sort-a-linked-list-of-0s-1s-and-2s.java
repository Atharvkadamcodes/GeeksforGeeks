/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {

        Node zeroHead = null, zeroTail = null;
        Node oneHead = null, oneTail = null;
        Node twoHead = null, twoTail = null;

        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = null;

            if (curr.data == 0) {
                if (zeroHead == null) {
                    zeroHead = zeroTail = curr;
                } else {
                    zeroTail.next = curr;
                    zeroTail = curr;
                }
            } 
            else if (curr.data == 1) {
                if (oneHead == null) {
                    oneHead = oneTail = curr;
                } else {
                    oneTail.next = curr;
                    oneTail = curr;
                }
            } 
            else {
                if (twoHead == null) {
                    twoHead = twoTail = curr;
                } else {
                    twoTail.next = curr;
                    twoTail = curr;
                }
            }

            curr = next;
        }

        if (zeroHead != null) {
            if (oneHead != null) {
                zeroTail.next = oneHead;
                oneTail.next = twoHead;
            } else {
                zeroTail.next = twoHead;
            }
            return zeroHead;
        }

        if (oneHead != null) {
            oneTail.next = twoHead;
            return oneHead;
        }

        return twoHead;
    }
}