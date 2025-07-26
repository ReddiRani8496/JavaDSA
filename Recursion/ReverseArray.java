package Recursion;

import java.util.Arrays;

public class ReverseArray {
      public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int left,int right) {
        if(left>=right) return;

       int temp = arr[left];
       arr[left] = arr[right];
       arr[right] = temp;

       reverseArray(arr, left+1,right-1);

    }
}
