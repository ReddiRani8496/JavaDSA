package ArrayList;

import java.util.Arrays;

public class ArrayListImpl {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList(5);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        System.out.println(arr.getSize());
        arr.removeAt(2);
        System.out.println(arr.getSize());
        arr.printArray();
        System.out.println(arr.indexOf(150));
        arr.insert(20);
        arr.insert(50);
        arr.printArray();
        System.out.println(arr.firstIndexOf(20));
        System.out.println(arr.lastIndexOf(20));
        System.out.println(arr.firstIndexOf(50));
        System.out.println(arr.lastIndexOf(50));
        System.out.println(arr.contains(10));
        arr.printArray();
        arr.sort();
        arr.printArray();
        arr.reverse();
        arr.printArray();
        arr.printMiddleTerm();
        arr.insert(70);
        arr.printMiddleTerm();
    }
}

class MyArrayList {

    private int items[];

    MyArrayList() {
        items = new int[10];
    }

    MyArrayList(int size) {
        items = new int[size];
    }

    private int count = 0;

    public void insert(int data) {

        if(count== items.length) {
            int[] temp = new int[items.length*2];
            for (int i = 0; i < count; i++) {
                temp[i] = items[i];
            }

            items = temp;
        }

        items[count++] = data;

    }

    public int getSize() {
        return count;
    }

    public void removeAt(int index) {
        if(index<0 || index>=count)
            throw  new IllegalStateException();

        for (int i = index; i < count-1; i++)
                items[i] = items[i+1];

        count--;
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if(items[i]==value) return i;
        }
        return -1;
    }

    public int firstIndexOf(int value) {
        for (int i = 0; i < count; i++) {
            if(items[i]==value) return i;
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i=count-1;i>=0;i--) {
            if(items[i]==value) return i;
        }
        return -1;
    }

    public boolean contains(int value) {
        for (int item : items) {
            if (item == value) return true;
        }
        return false;
    }

    int index = 0;

    public boolean hasNext() {
        return index !=count;
    }

    public void next() {
        index++;
    }

    public void trimToSize() {
        int temp[] = new int[count];
        for (int i=0;i<count;i++)
            temp[i] = items[i];
        items = temp;
    }

    public void sort() {
        int temp[] = Arrays.copyOf(items,count);
        Arrays.sort(temp);
        for (int i = 0; i < count; i++) {
            items[i] = temp[i];
        }

    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if(items[i]<min)
                min = items[i];
        }
        return min;
    }

    public int max() {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <count ; i++) {
            if(items[i]>max)
                max = items[i];
        }
        return max;
    }

    public void reverse() {
        int left = 0;
        int right = count-1;
        while (left<right) {
            int temp = items[left];
            items[left] = items[right];
            items[right] = temp;
            left++;
            right--;
        }
    }

    public void printMiddleTerm() {
        int middle = count/2;
        // 10 20 30 40
        if(count%2==0) {
            System.out.println(items[middle-1]+" "+ items[middle]);
        }
        else {
            System.out.println(items[middle]);
        }
    }
}

