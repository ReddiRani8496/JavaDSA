package Recursion;

public class IsPowerTwoAppr2 {
    public static void main(String[] args) {
        int num = 32;

        if((num & (num-1))==0)
           System.out.println("power of two");
        else 
           System.out.println("Not power of two");

    }
}
