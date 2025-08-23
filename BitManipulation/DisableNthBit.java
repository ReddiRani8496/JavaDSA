package BitManipulation;

import java.util.Scanner;

public class DisableNthBit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        int complementOfMaskNumber = ~(1<<pos);
        System.out.println(n & complementOfMaskNumber);
    }
}
