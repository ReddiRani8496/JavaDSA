package BitManipulation;

import java.util.Scanner;

public class ClearRightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
       while (n!=0 && i<=32) {
           if((n & 1<<i)!=0) {
               n = n ^ 1<<i;
               break;
           }
          i++;
       }
       System.out.println(n);
    }
}
