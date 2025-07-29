package Recursion;

import java.util.Scanner;

public class PrintFirstOccurenceOfN {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        printFirstOccurence(arr,key,0);
    }

    public static void printFirstOccurence(int[] arr,int key, int index) {
        if(index>=arr.length) return;

        if(arr[index]==key) {
            System.out.println(index);
            return;
        }

        printFirstOccurence(arr,key,index+1);
    }
}
