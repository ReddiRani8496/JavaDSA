package BitManipulation;

public class FindTwoDuplicateValues {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,2,4};
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
       int pos = 0;
       while ((xor & (1<<pos))==0) {
        pos++;
       }

       int n1 =0;
       int n2 =0;
         for (int i = 0; i < arr.length; i++) {
            if((arr[i] & (1<<pos))==0) {
                n1 ^= arr[i];
            } else {
                n2 ^= arr[i];
            }
         }
         System.out.println(n1 + " " + n2);
    }
}
