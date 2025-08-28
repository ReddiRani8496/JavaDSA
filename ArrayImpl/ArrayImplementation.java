package ArrayImpl;

import java.util.Arrays;

public class ArrayImplementation {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.insert(10);
        myArray.insert(20);
        myArray.insert(30);
        myArray.insert(40);
        myArray.insert(50);
        myArray.printAll();
        myArray.reverse();
        myArray.printAll();
        myArray.sort();
    }
}

class MyArray {
    int[] items;
    int count = 0;

    MyArray() {
        items = new int[10];
    }

    MyArray(int size) {
        items = new int[size];
    }

    public void insert(int element) {
        if(count== items.length) {
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = element;
    }

    public void removeLast() {
        if(count==0) throw new IllegalStateException();
        count--;
    }

    public int getSize() {
        return count;
    }

    public void set(int index,int element) {
        if(index>=0 && index<count) {
            items[index] = element;
        } else throw new IllegalArgumentException();
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if(items[i]>max) {
                max = items[i];
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if(items[i]<min) {
                min = items[i];
            }
        }
        return min;
    }

    public void removeAt(int index) {
        for (int i = index; i < count-1; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if(items[i]==value) return i;
        }

        return -1;
    }

    public int valueOf(int index) {
        if(index>=0 && index<count) return items[index];
        else throw new IllegalArgumentException();
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += items[i];
        }
        return sum;
    }

    public void reverse() {
        int j = count-1;
        for (int i = 0; i < count/2; i++) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            j--;
        }
    }

    public void sort() {

        System.out.println(Arrays.toString(items));
        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j < count-i-1; j++) {
                if(items[j]>items[j+1]) {
                    int temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(items));

    }

    public void union(int[] arr) {

    }

    public void intersection(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<items.length;j++) {
                
            }
        }
    }
}

