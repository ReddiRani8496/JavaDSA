package DoublyLinkedlistImpl;

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();
        myDoublyLinkedList.insertLast(10);
        myDoublyLinkedList.insertLast(20);
        myDoublyLinkedList.insertLast(30);
        myDoublyLinkedList.insertLast(40);
        myDoublyLinkedList.print();
        myDoublyLinkedList.removeLast();
        myDoublyLinkedList.print();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.print();

    }
}


class MyDoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    void insertFirst(int data) {
        Node node = new Node(data);
        if(head==null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    void insertLast(int data) {
        Node node = new Node(data);
        if(head ==null) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }


    void print() {
        Node current = head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    void printReverse() {
        Node current = tail;
        while (current!=null) {
            System.out.print(current.data+" ");
            current = current.prev;
        }
        System.out.println();
    }

    boolean contains(int data) {
        Node current = head;
        while (current!=null) {
            if(current.data==data)
                return true;
            current = current.next;
        }
        return false;
    }

    void removeLast() {
        Node current = head;
        if(head==null) throw new IllegalStateException();
        while (current.next!=tail) {
            current =current.next;
        }

        current.next = null;
        tail.prev = null;
        tail = current;
    }

    void removeFirst() {
        if(head==null) throw new IllegalStateException();
        Node temp = head.next;
        head.next = null;
        head = temp;
    }
}

