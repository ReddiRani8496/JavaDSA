package Arrays;

import java.util.Scanner;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements; ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = findDuplicate(arr);
        System.out.println("Duplicate element is: " + element);

        int duplicateElement = findDuplicateAppr2(arr);
        System.out.println("Duplicate element iss " + duplicateElement);
    }

    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j) {
                    if(arr[i]==arr[j])
                        return arr[i];
                }
            }
        }
        return -1;
    }

    public static int findDuplicateAppr2(int[] arr) {
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            element ^= arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            element ^= i;
        }
        return element;
    }
}

