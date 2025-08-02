package Recursion;

public class IsPowerTwoAppr1 {
    public static void main(String[] args) {
        int num = 23;
        boolean res = isPowerOfTwo(num);
        System.out.println(res);
    }

    public static boolean isPowerOfTwo(int num) {
        if(num==1) 
        return true;
        if(num<1 || num%2!=0) 
        return false;

        return isPowerOfTwo(num/2);
    }
}
