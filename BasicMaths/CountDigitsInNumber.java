package BasicMaths;

import java.util.Scanner;
import static java.lang.Math.log;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        // int count = countDigits(number); // O(log n)
        // System.out.println(count); 
        int count = (int) Math.log10(number)+1; // O(1)
        System.out.println(count);
    }
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
