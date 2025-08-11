package Arrays;

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();

        int totalElements = findTripletPairs(arr,targetSum);
        System.out.println("Total pairs are: " + totalElements);
    }

    public static int findTripletPairs(int[] arr, int targetSum) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==targetSum) total++;
                }
            }
        }
        return total;
    }
}

