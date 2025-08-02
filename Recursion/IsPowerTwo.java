package Recursion;

public class IsPowerTwo {
    public static void main(String[] args) {
        int num = 32;
        while (true) {
            if(num == 1) {
                System.out.println("power of 2");
                break;
            }

            if(num<1 || num%2!=0) {
                System.out.println("Not Power of 2");
                break;
            }

            num /= 2;
        }

    }
}
