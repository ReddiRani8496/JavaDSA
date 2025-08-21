package BitManipulation;

import java.util.Scanner;

public class TwoNumbersEqual {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if((num1^num2) == 0) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}
