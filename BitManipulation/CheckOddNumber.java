package BitManipulation;

public class CheckOddNumber {
    public static void main(String[] args) {
        int [] arr = {2,1,2,1,1,3,3};
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        System.out.println(res);
    }
}
