package Recursion;

public class isSubsequence {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        boolean result = checkSubsequence(str1, str2);
        System.out.println(result);
    }

    public static boolean checkSubsequence(String str1, String str2) {
        if(str1.isEmpty()) {
            return true;
        }
        if(str1.length()>str2.length()) {
            return false;
        }
        if(str1.charAt(0) == str2.charAt(0)) {
            return checkSubsequence(str1.substring(1), str2.substring(1));
        }
        return checkSubsequence(str1, str2.substring(1));
    }
}