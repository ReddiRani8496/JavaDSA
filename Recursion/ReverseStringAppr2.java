package Recursion;

import java.util.Scanner;

public class ReverseStringAppr2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedString = reverseString(str,0);
        System.out.println(reversedString);
    }

    public static String reverseString(String str, int index) {
        if(index>=str.length()) return "";

        return reverseString(str,index+1)+str.charAt(index);
    }
}
