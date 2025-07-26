package Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
       String str = "MADAM";
       boolean palindrome = isPalindrome(str,0,str.length()-1);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String str, int left, int right) {
      if(left>=right) return true;
      if(str.charAt(left)!=str.charAt(right))
          return false;

      return isPalindrome(str,left+1,right-1);

    }
}
