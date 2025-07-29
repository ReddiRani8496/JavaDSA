package Recursion;

import java.util.Scanner;

public class PrintAllOccurencesOfN {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        printAllOccurencesOfNumber(arr,key,0);
    }

    public static void printAllOccurencesOfNumber(int[] arr,int key, int index) {
        if(index>=arr.length) return;

        if(arr[index]==key) System.out.println(index);

        printAllOccurencesOfNumber(arr,key,index+1);
    }
}
