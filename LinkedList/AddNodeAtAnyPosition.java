package LinkedList;

public class AddNodeAtAnyPosition {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static int get(int idx) {
        if (idx >= size || idx < 0)
            return -1;
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    static void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    static void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    static void addAtAnyIndex(int idx, int val) {
        if (idx < 0 || idx > size)
            return;
        if (idx == 0) {
            addAtHead(val);
            return;
        }
        if (idx == size) {
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    static void deleteAtAnyIndex(int idx) {
        if (idx < 0 || idx >= size)
            return;
        Node temp = head;
        if (idx == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
            size--;
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;

        size--;
    }

    public static void main(String[] args) {
        addAtTail(20);
        addAtTail(30);
        addAtAnyIndex(0, 1);
        addAtAnyIndex(size, 40);
        display();
        System.out.println();
        System.out.println("Element at index 0: " + get(0));
        System.out.println("Element at index 3: " + get(3));

    }

}
