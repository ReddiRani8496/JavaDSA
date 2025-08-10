package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // 3
        // 0 1 2
    arrange2(arr,n);

    }

    public static void arrange(int[] arr, int n) {
        int value = 1;
        for (int i = 0; i < n/2; i++) {
            arr[i] = value++;
            arr[n-i-1] = value++;
        }
        if(n%2!=0)
            arr[n/2] = value;
        System.out.println(Arrays.toString(arr));
    }

    public static void arrange2(int[] arr,int n) {
        int left = 0;
        int right = n-1;
        int value = 1;
        while (left<=right) {
            if(value%2!=0) {
                arr[left] = value;
                left++;
                value++;
            } else {
                arr[right] = value;
                right--;
                value++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
