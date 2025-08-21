package BitManipulation;

import java.util.Scanner;

public class AlternateBitPattern {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        boolean res = (n & 1) ==1;
        int mask = res ? 1 : 0;
      // 1010
        System.out.println(mask);
        while (n!=0) {
            if((n&mask<<1)!=0) { // 1010& 1<<0
                System.out.println("Not in pattern ");
                return;
            }
          mask = mask==1?0:1;
            n = n>>1;
        }
        System.out.println("it is in pattern");
    }
}
