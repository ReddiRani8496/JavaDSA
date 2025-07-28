package Recursion;


public class ValidPalindromeLeetcode {
     public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }



    public static boolean isPalindrome(String s) {
        // A man, a plan, a canal: Panama
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;

            else if (!s.substring(left,left+1).equalsIgnoreCase(s.substring(right,right+1)))
                return false;
            else if (s.substring(left,left+1).equalsIgnoreCase(s.substring(right,right+1))) {
                left++;
                right--;
            }

        }
        return true;
    }
}
