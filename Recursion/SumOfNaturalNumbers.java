package Recursion;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum of first 10 natural numbers is: " + result);
    }    
    public static int sum(int n) {
        if(n==0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
