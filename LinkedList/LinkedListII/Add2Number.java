package LinkedList.LinkedListII;

public class Add2Number {
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
    static Node add2Number(Node l1,Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null){
            Node newNode = new Node(carry);
            if(l1 != null) {
                newNode.val+=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                newNode.val+=l2.val;
                l2 = l2.next;
            }
            temp.next = newNode;
            carry = newNode.val/10;
            newNode.val %= 10;
            temp = temp.next;
        }
        if(carry>0){
            Node newNode = new Node(carry);
            temp.next = newNode;
        }
        return dummy.next;
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
        Node x = new Node(2);
        Node  y= new Node(5);
        Node z = new Node(7);
        x.next = y;
        y.next = z;
        display(x);
        Node head = add2Number(a, x);
        display(head);
    }
}
