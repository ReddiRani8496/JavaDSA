package BasicMaths;

import java.util.Scanner;

public class PrintDigitsOfNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        printDigits(number);
    }

    public static void printDigits(int n) {
        while (n>0) {
            int digit = n%10;
            System.out.println(digit);
            n/=10;
        }
    }
}
