package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEachArrayElementWithIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mul(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mul(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= i;
        }
    }
}

