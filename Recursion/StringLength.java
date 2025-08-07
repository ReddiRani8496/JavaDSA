package Recursion;

public class StringLength {
    public static void main(String[] args) {
        String str = "hello";
        int len = stringLength(str);
        System.out.println(len);
    }

    public static int stringLength(String str) {
        if(str.isEmpty()) return 0;

        return 1 + stringLength(str.substring(1));
    }
}
