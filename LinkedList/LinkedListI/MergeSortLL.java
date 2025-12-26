package LinkedList.LinkedListI;

public class MergeSortLL {
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
    static Node merge(Node list1,Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
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

        Node x = new Node(2);
        Node  y= new Node(5);
        Node z = new Node(7);
        x.next = y;
        y.next = z;
        Node  head =merge(a, x);
        display(head);
        
    }
    
}
