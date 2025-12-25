package LinkedList.LinkedListI;

public class MiddleOfLinkedList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(findMiddle(a).val);
    }
    
}
