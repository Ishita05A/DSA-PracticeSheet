package LinkedList.LinkedListII;

public class RotateList {
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
        Node after = head;
        Node prev = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    static int sizeOfLL(Node head){
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    static Node rotate_optimized(Node head,int k){
        if(head == null || head.next == null || k == 0) return head;
        Node temp = head;
        int n = sizeOfLL(head);
        k = k%n;
        while(temp.next != null) temp = temp.next;
        temp.next = head;
        temp = head;
        for(int i = 1;i<n-k;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
    static Node rotate(Node head,int k){
        if(head == null || head.next == null || k == 0) return head;
        Node temp = head;
        int n = sizeOfLL(head);
        k = k%n;
        for(int i = 1;i<n-k;i++){
            temp = temp.next;
        }
        Node head2 = reverse(temp.next);
        temp.next = null;
        Node head1 = reverse(head);
        temp = head1;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head2;
        head1 = reverse(head1);
        return head1;
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
        // display(rotate(a, 2));
        display(rotate_optimized(a, 2));
    }
    
}
