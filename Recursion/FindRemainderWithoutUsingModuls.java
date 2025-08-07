package Recursion;

public class FindRemainderWithoutUsingModuls {
   


   public static void main(String[] args) {
    int res = findRemainder(15,6);   
    System.out.println(res);
   }

   public static int findRemainder(int div,int divd) {
    if(div<divd) return div;
    return findRemainder(div-divd, divd);
   }
}


