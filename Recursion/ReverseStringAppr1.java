package Recursion;

import java.util.Scanner;

public class ReverseStringAppr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }



    public static String reverseString(String str) {
        if(str.length()<=0) return str;

        return reverseString(str.substring(1))+str.charAt(0);
    }
}
