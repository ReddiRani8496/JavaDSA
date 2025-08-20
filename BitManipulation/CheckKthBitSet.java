package BitManipulation;

public class CheckKthBitSet {
    public static void main(String[] args) {
        int n = 10; // 1010
        int k = 1;
        int mask = 1;
        if((n &(mask<<k))!=0) {
            System.out.println("set bit");
        } else {
            System.out.println("Not set bit");
        }
    }
    
}
