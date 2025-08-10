package Arrays;

public class ArraysWithFunctions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        incrementArray(arr);
        printArray(arr);
    }

    public static void incrementArray(int[] input) {
        input = new int[5];
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i]+1;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

