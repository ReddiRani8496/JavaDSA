package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        sort0sand1s(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort0sand1s(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            if(arr[left]!=0 && arr[right]!=1) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if(arr[left]!=0 && arr[right]==1) {
                right--;
            } else if(arr[left]==0 && arr[right]!=1) {
                left++;
            } else {
                left++;
                right--;
            }
        }
    }
}

