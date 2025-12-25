package LinkedList;

public class DeleteNodeInLL {
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
    static void delete(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
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
        delete(c);
        
        display(a);

    }
    
}
