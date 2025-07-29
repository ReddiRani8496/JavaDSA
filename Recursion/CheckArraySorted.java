package Recursion;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       boolean res =  isArraySorted(arr,0);
        System.out.println("Is array sorted: " + res);
    }

    public static boolean isArraySorted(int[] arr, int index) {
        if(index>=arr.length-1) return true;

       if(arr[index] > arr[index+1]) return false;

      return isArraySorted(arr,index+1);
    }
}
