package LinkedList.LinkedListII;

public class RemoveDuplicateFromSortedList {
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
    static Node removeDuplicate(Node head){
        Node temp = head.next;
        Node dummyHead = head;
        Node tail = dummyHead;
        while(temp != null){
            if(temp.val != tail.val){
                tail.next = temp;
                tail = tail.next;
                
            }
            temp = temp.next;
        }
        return dummyHead;

    }
    public static void main(String[] args) {
         Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(3);
        Node f = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        display(removeDuplicate(a));
    }
    
}
