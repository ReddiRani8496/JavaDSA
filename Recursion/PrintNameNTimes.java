package Recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        int n= 5;
        String name = "Rani";
        printName(name,n);
    }

    public static void printName(String name,int n) {
        if(n==0) return;

        System.out.println(name);
        printName(name,n-1);
    }
    
}