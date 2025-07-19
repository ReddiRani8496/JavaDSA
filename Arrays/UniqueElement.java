package Arrays;
    import java.util.*;
import java.lang.*;
import java.io.*;

public class UniqueElement {


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int missing = -1;
        int i=0;
        // Approach 1 O(nlogn)
        // while(i<arr.length-1) {
        //  if(arr[i]!=arr[i+1]) {
        //      missing = arr[i];
        //      i+=1;
        //  } else i+=2;   
        
        // } if(i<arr.length) {
        //     if(arr[i-1]!=arr[i])
        //       missing = arr[i];
        // }
        // System.out.println(missing);


        // Approach 2 O(n log n)
        // while(i<arr.length-1) {
        //     if( arr[i]!=arr[i+1]) {
        //         missing = arr[i];
        //         break;
        //     } 
        //      i+=2;
        
        // }
        // if(i== arr.length-1) {
        //     missing = arr[i];
        // }
        //System.out.println(missing);

        // Approach 3 O(n)
        for(int j=0;j<arr.length;j++) {
            missing ^= arr[j];
        }
        System.out.println(missing);
    }
	}
}


