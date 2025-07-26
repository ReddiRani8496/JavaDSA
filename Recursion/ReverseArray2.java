package Recursion;

import java.util.Arrays;

public class ReverseArray2 {
      public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int i) {
        if(i>=arr.length/2) return;

       int temp = arr[i];
       arr[i] = arr[arr.length-i-1];
       arr[arr.length-i-1] = temp;

       reverseArray(arr, i+1);

    }
}
