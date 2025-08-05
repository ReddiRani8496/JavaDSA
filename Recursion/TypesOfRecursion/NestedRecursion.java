package Recursion.TypesOfRecursion;

public class NestedRecursion {
    public static void main(String[] args) {
       int res = getData(90);
       System.out.println(res);
    }

    public static int getData(int n) {
        if(n>10) return n-10;

        return getData(n/2);
    }
}
