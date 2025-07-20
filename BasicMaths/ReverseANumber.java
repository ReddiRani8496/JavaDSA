package BasicMaths;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = reverse(number); // O(log n)
        System.out.println(reversedNumber);
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n>0) {
            int rem = n%10;
            reverse = reverse*10+rem;
            n /=10;
        }
        return reverse;
    }

      public static int reverse(int x) {
        if(x<=1)
          return 1;
        return (x%10)*10+reverse(x/10); 
    }
    
}
