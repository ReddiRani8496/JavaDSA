package BitManipulation;

public class FindTheMissingNumber {
    public static void main(String[] args) {
         int[] arr = {1,2,3,5};
        int n = 5;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
        }

        for (int i = 1; i <= n; i++) {
            sum ^=i;
        }
        System.out.println(sum);
    }
}
