package Recursion;

public class DecToBin {

    public static void main(String[] args) {
        int n = 15;
        convertDecToBin(n);
    }

    public static void convertDecToBin(int n) {
        if(n<=0) return;

        convertDecToBin(n/2);
        System.out.print(n%2);
    }
}