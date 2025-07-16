package Recursion;

public class Count7 {
    public static void main(String[] args) {
        int number = 717;
        int count = count7(number);
        System.out.println(count);
    }

    public static int count7(int n) {
        if(n<7) {
            return 0;
        }
        return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
    }
    
}
