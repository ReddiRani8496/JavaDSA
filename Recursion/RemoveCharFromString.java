package Recursion;

public class RemoveCharFromString {
      public static void main(String[] args) {
        String str = "Hello welcome to java world";
        char ch = 'l';
        String res = removeChar(str,ch);
        System.out.println(res);
    }

    public static String removeChar(String str, char ch) {
        if(str.isEmpty())
            return str;

        if(str.charAt(0)==ch)
            return removeChar(str.substring(1),ch);

        return str.charAt(0)+removeChar(str.substring(1),ch);
    }
}
