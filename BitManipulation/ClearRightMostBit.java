package BitManipulation;

import java.util.Scanner;

public class ClearRightMostBit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n&(n-1));
    }   
}
