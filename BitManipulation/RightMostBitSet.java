package BitManipulation;

public class RightMostBitSet {
    public static void main(String[] args) {
        int n  = 11;
        if((n&1)==0) {
            System.out.println("Not set bit");
        } else {
            System.out.println("set bit");
        }
    }
}
