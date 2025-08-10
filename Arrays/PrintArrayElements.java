package Arrays;

import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String[] args) {
        int[] arr = takeInput();

        printArrayElement(arr);
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter "+(i+1)+"th element of the array: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArrayElement(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

