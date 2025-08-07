package Recursion;

public class LinkedListEx {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.printLinkedList();

        System.out.println(l.getTotalNodes());
        System.out.println(l.getSumOfNodes());
    }
}

class Node {
    int data;
    Node nextAddress;

    Node(int data) {
        this.data = data;
    }
}


class MyLinkedList {
    Node head;
    Node tail;

    void addLast(int data) {
        Node node = new Node(data);
        if(isEmpty()) head = tail = node;
        else {
            tail.nextAddress = node;
            tail = node;
        }
    }


    boolean isEmpty() {
        return  head== null;
    }

    void printLinkedList() {
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.nextAddress;
        }
    }

    int getTotalNodes() {
        return totalNodes(head);
    }

    private int totalNodes(Node current) {
        if(current==null) return 0;

        return 1+ totalNodes(current.nextAddress);

    }

    int getSumOfNodes() {
        return sumOfNodes(head);
    }

   private int sumOfNodes(Node current) {
        if(current==null) return 0;

        return current.data + sumOfNodes(current.nextAddress);
    }

}

