package LinkedList.Introduction;

public class LinearSearchInLL {
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
    static Node linearSearch_iterative(Node head,int key){
        Node temp = head;
        while(temp != null){
            if(temp.val == key) return temp;
            temp = temp.next;
        }
        return null;
    }
    static Node linearSearch_recursive(Node head,int key){
        if(head == null) return null;
        if(head.val == key) return head;
        return linearSearch_iterative(head.next, key);

    }
    static Node linearSearch_moveToFront_method(Node head,int key){
        Node temp = head;
        Node q = null;
        while(temp != null){
            if(temp.val == key){
                q.next = temp.next;
                temp.next = head;
                head = temp;
                return head;

            }
            q = temp;
            temp = temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
         Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(linearSearch_iterative(a, 6).val);
        System.out.println(linearSearch_recursive(a, 6).val);
        System.out.println(linearSearch_moveToFront_method(a, 6).val);
    }
    
}
