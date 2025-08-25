package BitManipulation;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1)==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
