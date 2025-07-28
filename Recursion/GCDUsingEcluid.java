package Recursion;

public class GCDUsingEcluid {

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int result = gcd(a, b);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
}


// a = 48, b = 18
// find remainder of a and b a%b = 48%18 = 12
// now update a as b and b as a%b
// a = 18, b = 12
// find remainder of a and b a%b = 18%12 = 6
// now update a as b and b as a%b
// a = 12, b = 6
// find remainder of a and b a%b = 12%6 = 0
// now update a as b and b as a%b
// a = 6, b = 0
// since b is 0, return a which is 6
// so gcd is 6.