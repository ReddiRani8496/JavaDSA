package Recursion;

public class SubStrings {
      public static void main(String[] args) {
        // total substrings will be n*(n+1)/2

        String str = "Rockstar";
        printSubStrings(str,0,1, 0);
    }

    public static void printSubStrings(String str, int start,int end, int count) {
        if(start==str.length()+1) {
            System.out.println("Total substrings " + count);
            return;
        }

        if(end == str.length()+1) {
            printSubStrings(str,start+1,start+2,count);
        } else {
            System.out.println(str.substring(start,end));
            printSubStrings(str,start,end+1,count+1);
        }
    }
}