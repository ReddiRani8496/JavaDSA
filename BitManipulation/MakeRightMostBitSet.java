package BitManipulation;

public class MakeRightMostBitSet {
    public static void main(String[] args) {
        int n = 11;
        if((n&1)!=0) {
            System.out.println(n);
        } else {
            n = n|1;
            System.out.println(n);
        }
    }
}
