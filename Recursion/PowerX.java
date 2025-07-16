package Recursion;

public class PowerX {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
       System.out.println(result);
    }

    public static int power(int base,int exponent) {
        if(exponent == 0) {
            return 1; 
        }
        return base * power(base, exponent-1);
    }
}
