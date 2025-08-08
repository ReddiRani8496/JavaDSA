package LinkedList;

import java.util.NoSuchElementException;

public class LinkedListEx {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(10);
        System.out.println(linkedList.getSize());
        linkedList.addLast(20);
        System.out.println(linkedList.getSize());
        linkedList.printLinkedList();
        linkedList.addFirst(30);
        linkedList.printLinkedList();
        System.out.println(linkedList.indexOf(20));
        linkedList.addFirst(20);
        linkedList.printLinkedList();
        System.out.println(linkedList.contains(20));
        System.out.println(linkedList.valueOf(0));
        linkedList.printLinkedList();
        linkedList.removeFirst();
        linkedList.printLinkedList();
        linkedList.removeLast();
        linkedList.printLinkedList();
//        linkedList.removeLast();
//        linkedList.printLinkedList();
//        linkedList.removeLast();
//        linkedList.printLinkedList();
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


    public void addLast(int data) {
        Node node = new Node(data);
        if(isEmpty())  {
            head= tail = node;
            return;
        }

        Node current = head;
        while (current.nextAddress!=null) {
            current = current.nextAddress;
        }

        current.nextAddress = node;
        tail = node;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            head = tail = node;
            return;
        }

        node.nextAddress = head;
        head = node;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        Node current = head;
        int size = 0;
        while (current!=null) {
            size++;
            current = current.nextAddress;
        }
        return size;
    }

    public void printLinkedList() {
        Node current = head;
        while (current!=null) {
            System.out.print(current.data + " ");
            current = current.nextAddress;
        }
        System.out.println();
    }

    public int indexOf(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if(current.data == value) return index;
            index++;
            current = current.nextAddress;
        }
        return -1;
    }

    public int valueOf(int index) {
        Node current = head;
        int i = 0;
        while (current!=null) {
            if(i==index) return current.data;
            i++;
            current = current.nextAddress;
        }
        return -1;
    }

    public boolean contains(int value) {
        Node current = head;
        while (current!=null) {
            if(current.data==value) return true;
            current = current.nextAddress;
        }
        return false;
    }


    public void removeFirst() {
        if(isEmpty()) throw  new NoSuchElementException();

        if(head==tail) {
            head = tail = null;
            return;
        }

        Node tempAddr = head.nextAddress;
        head.nextAddress = null;
        head = tempAddr;
    }

    public void removeLast() {
        if(isEmpty()) throw  new NoSuchElementException();

        if(head==tail) {
            head = tail = null;
            return;
        }


        Node current = head;
        while (current.nextAddress!=tail) {
            current = current.nextAddress;
        }
        tail = current;
        tail.nextAddress = null;
    }

    public void reverse() {
            
    }

}

