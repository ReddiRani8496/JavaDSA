package Recursion;

import java.util.Scanner;

public class CountOfDigits {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countOfDigits(n));
    }

    public static int countOfDigits(int num) {
        if(num==0) return 0;

        return 1+countOfDigits(num/10);
    }
}