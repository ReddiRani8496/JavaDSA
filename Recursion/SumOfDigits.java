package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sumOfDigits(num);
        System.out.println(total);
    }
    public static int sumOfDigits(int n) {
        if(n<=0) return 0;

        return n%10+sumOfDigits(n/10);
    }
    
}