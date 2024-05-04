package geeksforgeeks.Array.prfixsum;

import java.util.Arrays;

public class Equilibrium_Point {
    public static void main(String[] args) {
        long A[] = {1};
        System.out.println(equilibriumPoint(A,A.length));

    }

//    O(2N)time complexity and O(1)space complexity
    public static int equilibriumPoint(long []arr, int n) {
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
            long rangesum=arr[n-1]-arr[i];
            if (i==0){
                if (rangesum==0)return 1;
                continue;
            }
            if (i==n-1){
                if (arr[i-1]==0)return i+1;
                continue;
            }
           if (arr[i-1]==rangesum){
               return i+1;
           }
        }

       return -1;
    }
}
