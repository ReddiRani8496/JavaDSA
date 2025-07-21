package Recursion;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr,int target, int left, int right) {
        if(left>right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }
}