package Arrays;

import java.util.Scanner;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        int[] arr = takeInput();

        int element = findUniqueElement(arr);
        System.out.println("Unique element is " + element);
        int elemnett = findUniqueElementAppr2(arr);
        System.out.println("Unique element: " + elemnett);
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findUniqueElement(int[] arr) {
        int element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            element ^= arr[i];
        }
        return element;
    }

    public static int findUniqueElementAppr2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (j = 0; j < arr.length; j++) {
                if(i!=j) {
                    if(arr[i]==arr[j]) {
                        break;
                    }
                }
            }
            if(j==arr.length) {
                return arr[i];
            }
        }
        return -1;
    }
}

