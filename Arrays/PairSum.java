package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();

        int totalElements = findTotalPairs(arr,targetSum);
        System.out.println("Total pairs are " + totalElements);

        System.out.println("Total pairs approach2 " + findTotalPairsAppr2(arr,targetSum));
    }

    public static int findTotalPairs(int[] arr, int targetSum) {
        int total  = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j]==targetSum) total++;
            }
        }

        return total;
    }

    public static int findTotalPairsAppr2(int[] arr,int targetSum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int required = targetSum-arr[i];
            if(map.containsKey(required)) total += map.get(required);

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        return total;
    }
}

