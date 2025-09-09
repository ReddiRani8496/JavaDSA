import java.util.Arrays;
import java.util.Stack;

public class LinkedListImplementation {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insert(10);
//        linkedList.insert(20);
//        linkedList.insert(30);
//        linkedList.insert(40);
//        linkedList.insert(50);
        linkedList.print();

        linkedList.removeAt(0);
        linkedList.print();
//        linkedList.removeLast();
//        linkedList.print();
//        linkedList.reverse();
//        linkedList.reverse1();
//        linkedList.print();
//        linkedList.printMiddle();
//        linkedList.insert(60);
//        linkedList.print();
//        linkedList.printMiddle();
       // System.out.println(linkedList.size());
//        System.out.println(linkedList.isEmpty());
//        linkedList.insertFirst(60);
//        linkedList.print();
//        linkedList.removeFirst();
//        linkedList.print();
//        linkedList.removeFirst();
//        linkedList.print();
//        System.out.println(linkedList.contains(40));
//        int[] res = linkedList.toArray();
//        System.out.println(Arrays.toString(res));
//        linkedList.print();
//        System.out.println(linkedList.getAtPosition(3));
//        System.out.println(linkedList.previousNode(linkedList.head.next).data);
//
//        System.out.println(linkedList.getNextNode1(linkedList.head).data);

    }

}

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {
    Node head;
    Node tail;

    public void insert(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            head = tail = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = node;
            tail = node;
        }
    }

    public void insertAt(int data, int index) {
        Node node = new Node(data);

        if(index == 0) {
           node.next = head;
           head = node;
           return;
        }

        int i = 0;

        Node current = head;

        while (current!=null && i+1==index) {
            current = current.next;
            i++;
        }

        if(current==null) throw new ArrayIndexOutOfBoundsException();

        node.next = current.next;
        current.next = node;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            head=tail=node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void print() {
        Node current = head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void removeLast() {
        if(isEmpty()) {
            throw new IllegalStateException();
        } else if(head==tail) {
           head = tail = null;
        } else {
            Node current = head;
            while (current.next!=tail) {
                current = current.next;
            }
            current.next = null;
            tail=current;
        }
    }

    public void removeFirst() {
        if(isEmpty()) {
            throw new IllegalStateException();
        } else if(head==tail) {
            head = tail = null;
        } else {
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
    }

    public void removeAt(int index) {
        if(isEmpty()) {
            throw new IllegalStateException();
        } else if(index==0) {
            removeFirst();
        } else {
            int i = 0;
            Node current = head;
            while (current!=null && (i+1)!=index) {
                i++;
                current = current.next;
            }
            if(current==null || current.next==null) throw new ArrayIndexOutOfBoundsException();

            else if(i+1 == index) {
                current.next = current.next.next;

            }
        }
    }

    public void reverse1() {
        if(isEmpty()) throw  new IllegalStateException();

        if(head==tail) return;
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current!=null) {
            stack.push(current.data);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }

    public void reverse() {
        if(isEmpty()) throw  new IllegalStateException();

        if(head==tail) return;

        rev(head,null);
        Node temp = head;
        head = tail;
        tail=temp;
    }

    private void rev(Node current, Node previous) {
        if (current==null) return;
        rev(current.next,current);
        current.next = previous;
    }

    public void printMiddle() {
        if(isEmpty()) throw new IllegalStateException();
        Node slow= head;
        Node fast = head;
        while ( fast!=tail && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast==tail) {
            System.out.println(slow.data);
        } else {
            System.out.println(slow.data +" " + slow.next.data);
        }
    }

    public void clear(){
        head = tail = null;
    }

    public void search(int data) {
        if(isEmpty()) throw new IllegalArgumentException();

        Node current = head;
        while (current!=null) {
            if(current.data == data) {
                System.out.println(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found");
    }

    public int size() {
        Node current = head;
        int count = 0;
        while (current!=null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int getFirst() {
        if(isEmpty()) throw new IllegalStateException();

        return head.data;
    }

    public int getLast() {
        if(isEmpty()) throw new IllegalStateException();

        return tail.data;
    }

    public boolean contains(int data) {
        if (isEmpty()) throw new IllegalArgumentException();

        Node current = head;
        while (current!=null) {
            if(current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public int[] toArray() {
        if (isEmpty()) throw new IllegalArgumentException();

        int count = 0;
        Node current = head;
        while (current!=null) {
            count++;
            current = current.next;
        }

        int[] arr = new int[count];
        int i =0;
        current = head;
        while (current!=null) {
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }

    public int getAtPosition(int index) {
        if(isEmpty()) throw new IllegalArgumentException();

        int count = 0;
        Node current = head;
        while (current!=null) {
            count++;
            current = current.next;
        }
        if(index>=count) throw new ArrayIndexOutOfBoundsException();

        int i = 0;
         current = head;
        while (current!=null) {
            if(i==index) {
                return current.data;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    public void setAtPosition(int index, int data){
        if(isEmpty()) throw new IllegalArgumentException();

        int count = 0;
        Node current = head;
        while (current!=null) {
            count++;
            current = current.next;
        }
        if(index>=count) throw new ArrayIndexOutOfBoundsException();

        int i = 0;
        current = head;
        while (current!=null) {
            if(i==index) {
                current.data = data;
                return;
            }
            current = current.next;
            i++;
        }
    }

    public Node previousNode(Node node) {
        Node current = head;
        while (current!=null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public Node getNextNode(Node node) {
        Node current = head;
        while (current!=tail) {
            if(current==node) return current.next;
            current = current.next;
        }
        return null;
    }

    public Node getNextNode1(Node node) {
        if(node == null) return null;
        return node.next;
    }

    public boolean loopExists() {
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return  true;
        }
        return false;
    }

    public Node findKthNodeFromStart(int k) {
        int count = 1;
        Node current = head;
        while (current!=null && count<k) {
            count++;
            current = current.next;
        }
        if(current==null) throw new IllegalArgumentException();
        return current;
    }

    public Node findKthNodeFromLast(int k) {
        int count = 0;
        Node current = head;

        while (current!=null) {
            count++;
            current = current.next;
        }
        if(k<=0 || k>count) throw new IllegalArgumentException();

        Node slow = head;
        Node fast = head;
        int i=0;
        while (i<k) {
            fast = fast.next;
            i++;
        }

        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
