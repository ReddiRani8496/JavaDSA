package BitManipulation;

import java.util.Scanner;

public class ToggleNthBit {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int pos = 2;
        System.out.println(n ^ (1<<pos));
    }
}
