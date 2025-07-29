package Recursion;

import java.util.Scanner;

public class ConvertStringToInteger {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(stringToInt(str,str.length()));
    }

    public static int stringToInt(String str,int n) {
        if(n==1) return str.charAt(0)-48;

        return (str.charAt(0)-48) * (int)Math.pow(10,n-1) + stringToInt(str.substring(1),n-1);
    }
}
