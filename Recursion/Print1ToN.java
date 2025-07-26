package Recursion;

public class Print1ToN {
     public static void main(String[] args) {
        int n= 5;

        printN(n);
    }

    public static void printN(int n) {
        if(n==0) return;

        printN(n-1);
        System.out.println(n);
    }
}
