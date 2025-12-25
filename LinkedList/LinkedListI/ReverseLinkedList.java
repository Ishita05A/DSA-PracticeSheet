package LinkedList.LinkedListI;

public class ReverseLinkedList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = head;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public static void main(String[] args) {
         Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        Node newHead = reverse(a);
        display(newHead);
    }
    
}
