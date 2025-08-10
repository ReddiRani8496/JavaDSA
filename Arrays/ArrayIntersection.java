package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter first array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter second array elements: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

    //  printIntersection1(arr,arr2);

      //  printIntersection2(arr,arr2);
        printIntersection3(arr,arr2);

    }

    public static void printIntersection1(int[] arr, int[] arr2) {
        System.out.println("Common elements are: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i]==arr2[j]) {
                    System.out.println(arr[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }

            }
        }
    }

    public static void printIntersection2(int[] arr,int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])) {
                System.out.println(arr2[i]);
                map.put(arr[i], map.getOrDefault(arr[i],0)-1);
            }
        }
    }

    public static void printIntersection3(int[] arr,int[] arr2) {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        while (i<arr.length && j<arr2.length) {
            if(arr[i]==arr2[j]) {
                System.out.println(arr[i]);
                j++;
            }
            i++;

        }
    }
}

